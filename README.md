Singly_Linked_List
A simple Java implementation of a Singly Linked List with basic operations such as node insertion, deletion, and calculating the length of the list.

Features
Insert a node at the beginning, end, or a specified position

Delete a node by key or position

Calculate the length of the list

Display the contents of the list

Getting Started
Clone the repository

text
git clone https://github.com/Anurag-k-007/Singly_Linked_List.git
Compile the Java files

text
javac SinglyLinkedList.java
Run the program

text
java SinglyLinkedList
Usage Example
java
SinglyLinkedList list = new SinglyLinkedList();

list.insertAtEnd(5);
list.insertAtEnd(10);
list.insertAtBeginning(2);

list.display(); // Output: 2 -> 5 -> 10

list.deleteNode(5);
list.display(); // Output: 2 -> 10

int len = list.length();
System.out.println("Length: " + len); // Output: 2
Project Structure
SinglyLinkedList.java – Main implementation file containing:

Node definition (Node class)

Insertion, Deletion, Length calculation, Display methods

License
This project is open source and available under the MIT License.

Acknowledgements
This implementation is intended for learning and demonstration of basic data structures in Java.
