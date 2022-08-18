/**
 * This class is used as a base to add square and pointthreeD into an array list
 * @author james Frayser
 * Summer 2022
 * Lab 3
 * ArrayList.java
 */

package arraylist;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	
   	/**
   	 * empty argument constructor
   	 */
   	public ArrayList()
	{   
   	                                                           	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
  
    /**
 	 * preferred argument constructor
 	 */
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
  /**
   * addItem adds an item to the list so that it can print it, and will notify when is 
   * full
   * @param item
   */
  	public void addItem(T item) {
  			if (currentItem >= this.size()) {
  				System.out.println("list is full");
  				return;
  			}
  			arList[currentItem] = item;
  			currentItem++;
  	}

  	/**
  	 * this will call the item from addItem to print
  	 * @param index
  	 * @return
  	 */
  	public T getItem(int index){

  		if(index >= this.size()){
  			System.out.println("List index out pf bounds "+index+" for size "+this.size());
  			return null;
  		}

      return arList[index];
  	}//end getItem

  	/**
  	 * determines the size of the array list
  	 * @return
  	 */
  	public int size(){
      return arList.length;
  	}//end size
	
}//end class
