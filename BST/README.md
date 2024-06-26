## DSW Algorithm
**The DSW (Day-Stout-Warren) algorithm is a tree balancing technique used to transform a binary search tree (BST) into a perfectly balanced binary search tree. The algorithm works in two main phases: the vine (or backbone) creation phase and the balancing phase.**

* Phase 1: Vine Creation
The goal of this phase is to transform the BST into a right-linear tree (or vine), where each node has no left child. This is achieved by repeatedly performing right rotations.

Initialize: Start with a pseudo-root node whose right child is the root of the BST.
Traversal: Traverse the tree using the right pointers.
Left Child Handling: For each node, if it has a left child, perform a right rotation to move the left child up, making it the right child of its parent.
Repeat: Continue this process until the tree is transformed into a vine, where every node only has a right child.

* Phase 2: Balancing the Vine
The goal of this phase is to convert the vine into a balanced binary search tree. This is done by repeatedly performing left rotations to reduce the height of the tree.

Calculate the Number of Nodes: Determine the total number of nodes in the vine.
Initial Rotation Count: Calculate the number of nodes to be placed at the bottom-most level of the tree to ensure the tree is as balanced as possible.
Initial Rotations: Perform the necessary number of left rotations to create the bottom-most level.
Subsequent Rotations: After the initial rotations, continue to perform left rotations on each level of the tree, reducing the height by half each time.
Repeat: Continue until the tree is balanced
