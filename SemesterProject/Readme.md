#CMPT 220 Semester Project
###Julia Mangan
##Readme
For my project I was tasked with building a Binary Search Tree. 

###Creating Elements
-  To start off, I created 3 Java Classes in my Base file: Main, BST, and Node. In my Main class, I have programmed all of my nodes using an insertion function. The values I chose to use are 5, 9, 4, 1, 7, 2, and 3. In my node class, I programmed the nodes as either rightchild or leftchild. The first node I inserted is the root, and the remaining 6 nodes will be deemed "rightchild" if their values are greater than the root, and "leftchild" if their values are less than the root. 
   

###Searching the Tree
- Next, I used a search function so that the user can type in a value, and a print statement will tell if that value is a node or not a node in my binary search tree. I then created implementSearch and height functions to find the height of the tree. Height is determined based on how many levels of nodes there are. The root is the first height, the left and right children are the second height, and the leaves that branch off of those are the additional heights. Depending on the order that I inserted values, each child can have right and left nodes depending on if the values are less than or greater than the child. My binary search tree has 5 levels. There are four nodes on the left of the tree and two nodes on the right of the tree. After this step, I then programmed my project to find the largest, smallest, and Nth largest element in the tree. I created functions called "smallestElement," "largestElement," and "NthLargestElement." These functions take in all of the nodes that I have inserted and return which node is the largest and smallest. For the "NthLargestElement," users are able to type in a number and the program returns the value. For example, if I were to type in "5"th largest, the program would return a "3."
###Manipulating the tree
-    I created a "deleteNode" function in order to delete a node from the bianry search tree. In my Main class, users can type in a value to delete, and the program will get rid of it from the tree. Whenever a node is deleted, the tree will reorganize so that only that node is deleted and not its children. For example, if the user asks to delete 9, the tree will reorganize to keep 9's child, 7, and 7 will take the place of 9 as the rightChild. If the user asks to get rid of the node that serves as the root of the tree, the tree will reorganize and return a new root.

 ###Tree Traversals
- The three types of traversals are in order, pre order, and post order. The in order traversal starts at the left node, goes to the root, and then to the right node. Pre order traversal starts at the root and goes to the left node and then the right node. Post order traversal starts at the left, goes to the right, and then up to the root. My program returns values for all of these traversals. 
  
###Advanced Searches
- Depth first search is the same as finding the three tree traversals, so I did not include this in my program, as it would be repetitive. Instead, I added a comment in my tree traversals stating that it is the same as depth first search. Breadth first search starts at the root and goes left then right. I imported a Queue and LinkedList so that my program is able to return the breadth first search. 

