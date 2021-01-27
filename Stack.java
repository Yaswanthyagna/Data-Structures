public class Stack{
    public static void main(String[] args){
        Stack_U obj = new Stack_U();                                    
        System.out.println(obj.peek());
    }
}
class Stack_U{
    int stk[];int top;
    public Stack_U(){
        stk = new int[5];
        top  = 0;
    }
    public void push(int e){
        if(isFull()){System.out.println("Stack is full");return;}
        stk[++top] = e;
        System.out.println("Item is Enterd"+e);
    }
    public int pop(){
        if(isEmpty()){System.out.println("Stack is empty");return(-1);}
        int k = stk[top--];
        return k;
    }
    public boolean isEmpty(){
        return(top==0?true:false);
    }
    public boolean isFull(){
        return(top==5?true:false);
    }
    public int peek(){
        return stk[top];
    }
    public void viewStack(){
        for(int i=top;i>0;i--){
            System.out.println(stk[i]);
        }
    }
} 
class GFG extends Stack_U {      
    boolean isOperator(char x)  
{ 
    switch(x) 
    { 
        case '+': 
        case '-': 
        case '*': 
        case '/': 
            return true; 
    } 
    return false; 
} 
  
public  String convert(String str) 
{ 
      
    // Length of expression  
    int l = str.length(); 
    for(int i = l - 1; i >= 0; i--) 
    { 
        char c = str.charAt(i); 
        if (isOperator(c)) 
        { 
            String op1 = Stack_U.pop(); 
            String op2 = Stack_U.pop(); 
              
            // Concat the operands and operator  
            String temp = "(" + op1 + c + op2 + ")"; 
            stack.push(temp); 
        }  
        else
        { 
              
            // To make character to string 
            stack.push(c + "");  
        } 
    } 
    return Stack_U.pop(); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String exp = "*-A/BC-/AKL"; 
    System.out.println("Infix : " + convert(exp)); 
} 
} 