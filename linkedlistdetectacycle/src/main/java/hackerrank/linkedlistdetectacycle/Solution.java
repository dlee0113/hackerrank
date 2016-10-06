package hackerrank.linkedlistdetectacycle;

public class Solution {
	public static void main(String[] args) {
		Node node1 = new Node();
		node1.data = 1;
		Node node2 = new Node();
		node2.data = 2;
		Node node3 = new Node();
		node3.data = 3;
		Node node4 = new Node();
		node4.data = 4;
		Node node5 = new Node();
		node5.data = 5;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node3; // node5 points to node3 creating a cycle
		
//		solution.print(node1);

		Solution solution = new Solution();
		System.out.println(solution.hasCycle(node1));
	}
	
	boolean hasCycle(Node head) {
		Node slowPointer = head;
		Node fastPointer = head;
		
		while (slowPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			
            if (slowPointer == null || fastPointer == null) {
                return false;
            }
			
			if (slowPointer == fastPointer) {
				return true;
			}
		}
		
		return false;
	}
	
	void print(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}
}
