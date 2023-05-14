package stack;

import java.util.Stack;

/*The Potato class has two instance variables: "type" and "poids", 
 * representing the type and weight of a potato, respectively. 
 * It also has a Stack<Potato> instance variable called "stack", 
 * which is used to store instances of the Potato class.*/
public class Potato implements PoidsAndType {
    private String type = "Pas de type";
    private double poids;
    private Stack<Potato> stack;

    
    /*The constructor of the Potato class takes two parameters:
     *  a string representing the type of potato, 
     *  and a double representing its weight. 
     *  It sets the values of the type and poids instance variables, 
     *  and initializes the stack variable to a new empty stack.*/
    public Potato(String t, double p) {
        this.setType(t);
        this.setPoids(p);
        this.stack = new Stack<>();
    }

    public void setType(String t) {
        this.type = t;
    }

    public void setPoids(double p) {
        if (p <= 0) {
            System.err.println("POIDS DE " + this.getType() + " EST INVALIDE -> " + p);
        } else {
            this.poids = p;
        }
    }

    public String getType() {
        return this.type;
    }
    
    public double getPoids() {
        return this.poids;
    }
    
    
    /*overridden to provide a string representation of the Potato instance, 
     * including its type and weight.*/
    public String toString() {
        return "Potato [type=" + type + ", poids=" + poids + "]";
    }
    
    
    //returns the number of elements currently in the stack
    public int getStackSize() {
        return stack.size();
    }
    
    //returns the top Potato object in the stack without removing it
    public Potato getTopPotato() {
        if (!stack.isEmpty()) {
        	/*The method uses the peek() method of the Stack class,
        	 *  which returns the top element of the stack without removing it.
        	 *  This means that the stack remains unchanged after calling this
        	 *  method.
        	 *  */
            return stack.peek();
        } else {
            System.out.println("La pile est vide.");
            return null;
        }
    }
    
    // returns the total weight of all Potato objects in the stack
    public double getTotalPoids() {
        double totalPoids = 0;
        for (Potato p : stack) {
            totalPoids += p.getPoids();
        }
        return totalPoids;
    }
    
    
    //adds the current Potato instance to the top of the stack.
    public void addToStack() {
    	
    	/*This line adds the current potato object to the top of 
    	 * the stack using the push method of the stack data structure*/
        this.stack.push(this);
        System.out.println("La pomme de terre de type " + this.getType() +
        		" et de poids " + this.getPoids() + " a été ajoutée à la pile.");
    }
    
    //removes the top Potato instance from the stack, if there is one.
    public void removeFromStack() {
        if (!this.stack.isEmpty()) {
        	/*pop() method of the Stack class to remove the top element 
        	 * and assigns it to a Potato variable p'*/
            Potato p = this.stack.pop();
            System.out.println("La pomme de terre de type " + p.getType() + 
            		" et de poids " + p.getPoids() + " a été retirée de la pile.");
        } else {
            System.out.println("La pile est vide.");
        }
    }
    
    
    //removes all elements from the stack
    public void clearStack() {
        stack.clear();
    }

    //prints the contents of the stack, one Potato instance per line.
    public void printStack() {
        if (!this.stack.isEmpty()) {
            System.out.println("Contenu de la pile de pommes de terre : ");
            for (Potato p : this.stack) {
                System.out.println("- " + p.toString());
            }
        } else {
            System.out.println("La pile est vide.");
        }
    }
}

