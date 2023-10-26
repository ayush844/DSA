public class NewMain {

    public static void main(String[] args) {
        BinaryTreeLL bintree = new BinaryTreeLL();
        bintree.insertNode("N1");
        bintree.insertNode("N2");
        bintree.insertNode("N3");
        bintree.insertNode("N4");
        bintree.insertNode("N5");
        bintree.insertNode("N6");
        bintree.insertNode("N7");
        bintree.insertNode("N8");
        bintree.insertNode("N9");

        bintree.levelOrderTraversal();
        System.out.println();

        //inserted new node at root
        //node added as a children on left of a parent node
        //node added as a children on right of a parent node
        //node added as a children on left of a parent node
        //node added as a children on right of a parent node
        //node added as a children on left of a parent node
        //node added as a children on right of a parent node
        //node added as a children on left of a parent node
        //node added as a children on right of a parent node
        //N1 N2 N3 N4 N5 N6 N7 N8 N9


//        System.out.println(bintree.getDeepestNode().value);
//        // N9
//        bintree.deleteDeepestNode();
//
//        System.out.println(bintree.getDeepestNode().value);
//        // N8
//
//        bintree.levelOrderTraversal();
//        // N1 N1 N2 N3 N4 N5 N6 N7 N8


        bintree.deleteGivenNode("N3");

        System.out.println("hello");

        bintree.levelOrderTraversal();




    }

}
