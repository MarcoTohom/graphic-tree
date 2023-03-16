    
    public void createTree(String string) {        
        string = "(" + string;
        string += ")";
        this.expresion = string;
        this.root = createTree();
    }
    
    public Nodo createTree() {
        String string = this.expresion;
        Stack<Nodo> nodeStack = new Stack<>();
        Stack<Character> characterStack = new Stack<>();
        Nodo temp, temp1, temp2;

        int[] p = new int[123];
        p['+'] = p['-'] = 1;
        p['/'] = p['*'] = 2;
        p['^'] = 3;
        p['('] = p[')'] = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                characterStack.add(string.charAt(i));
            }
            else if (Character.isDigit(string.charAt(i))) {
                temp = addNodo(string.charAt(i));
                nodeStack.add(temp);
            } else if (p[string.charAt(i)] > 0) {
                while (!characterStack.isEmpty() 
                && characterStack.peek() != '(' 
                && ((string.charAt(i) != '^' 
                && p[characterStack.peek()] >= p[string.charAt(i)]) || (string.charAt(i) == '^' 
                && p[characterStack.peek()] > p[string.charAt(i)]))) {
                    temp = addNodo(characterStack.peek());
                    characterStack.pop();
                    temp1 = nodeStack.peek();
                    nodeStack.pop();
                    temp2 = nodeStack.peek();
                    nodeStack.pop();
                    temp.setIzquierda(temp2);
                    temp.setDerecha(temp1);
                    nodeStack.add(temp);
                }
            characterStack.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                while (!characterStack.isEmpty() && characterStack.peek() != '(') {
                    temp = addNodo(characterStack.peek());
                    characterStack.pop();
                    temp1 = nodeStack.peek();
                    nodeStack.pop();
                    temp2 = nodeStack.peek();
                    nodeStack.pop();
                    temp.setIzquierda(temp2);
                    temp.setDerecha(temp1);
                    nodeStack.add(temp);
                }
                characterStack.pop();
            }
        }
        temp = nodeStack.peek();
        return temp;
    }
