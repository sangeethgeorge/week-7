package Week7;

public class Driver {
		public static void main(String[] args) {
			ArrayQ newArray = new ArrayQ();
			LinkedQueue newLinkQ = new LinkedQueue();
			int[] val = new int[]{1,7,3,4,9,2};
			
			for( int i=0; i<val.length; i++) {
				newArray.enqueue(val[i]);
				newLinkQ.enqueue(val[i]);
			}
			 			 
			 int arraycount = newArray.size();
			 for (int j=0; j<arraycount; j++) {
				 
				 int dQ = newArray.dequeue();
				 System.out.println("ArrayQ dequeued: "+ dQ);				 
			 }
			 int LinkCount = newLinkQ.size();
			 for (int j=0; j<LinkCount; j++) {
				 int lQ = newLinkQ.dequeue();
				 System.out.println("LinkedQueue dequeued: "+ lQ);
			 }			
	}

}
