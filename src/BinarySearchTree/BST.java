package BinarySearchTree;

public class BST {

    private Node root;

    public BST() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int data) {
        System.out.println(data+" is inserted");
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node.getData()) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    ////////////////////////////////////////////////////////////////////
    public void delete(int k) {

        if (isEmpty()) {
            System.out.println("Tree Empty");
        } else if (search(k) == false) {
            System.out.println("Sorry " + k + " is not present");
        } else {

            root = delete(root, k);

            System.out.println(k + " deleted from the tree");

        }

    }

    private Node delete(Node root, int k) {

        Node p, p2, n;

        if (root.getData() == k) {

            Node lt, rt;

            lt = root.getLeft();

            rt = root.getRight();

            if (lt == null && rt == null) {
                return null;
            } else if (lt == null) {

                p = rt;

                return p;

            } else if (rt == null) {

                p = lt;

                return p;

            } else {

                p2 = rt;

                p = rt;

                while (p.getLeft() != null) {
                    p = p.getLeft();
                }

                p.setLeft(lt);

                return p2;

            }

        }

        if (k < root.getData()) {

            n = delete(root.getLeft(), k);

            root.setLeft(n);

        } else {

            n = delete(root.getRight(), k);

            root.setRight(n);

        }

        return root;

    }
    
    /* Functions to search for an element */
    public boolean search(int val) {

        return search(root, val);

    }

    /* Function to search for an element recursively */
    private boolean search(Node r, int val) {

        boolean found = false;

        while ((r != null) && !found) {

            int rval = r.getData();

            if (val < rval) {
                r = r.getLeft();
            } else if (val > rval) {
                r = r.getRight();
            } else {

                found = true;

                break;

            }

            found = search(r, val);

        }

        return found;

    }

    /* Function for inorder traversal */
    public void inorder() {
         System.out.print("inorder: ");
        inorder(root);

    }

    private void inorder(Node r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
      

    }

    /* Function for preorder traversal */
    public void preorder() {
         System.out.print("preorder: ");
        preorder(root);
        System.out.println();

    }

    private void preorder(Node r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    /* Function for postorder traversal */
    public void postorder() {
        System.out.println();
         System.out.print("postorder: ");
        postorder(root);
        System.out.println();

    }

    private void postorder(Node r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");

        }
    }
}

