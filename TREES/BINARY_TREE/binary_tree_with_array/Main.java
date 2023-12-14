public class Main {
    public static void main(String[] args) {
//        BinaryTreeLL BT = new BinaryTreeLL();
//
//        BinaryNode N1 = new BinaryNode();
//        N1.value = "N1";
//
//        BinaryNode N2 = new BinaryNode();
//        N2.value = "N2";
//
//        BinaryNode N3 = new BinaryNode();
//        N3.value = "N3";
//
//        BinaryNode N4 = new BinaryNode();
//        N4.value = "N4";
//
//        BinaryNode N5 = new BinaryNode();
//        N5.value = "N5";
//
//        BinaryNode N6 = new BinaryNode();
//        N6.value = "N6";
//
//        BinaryNode N7 = new BinaryNode();
//        N7.value = "N7";
//
//        BinaryNode N8 = new BinaryNode();
//        N8.value = "N8";
//
//        N1.left = N2;
//        N1.right = N3;
//        N2.left = N4;
//        N2.right = N5;
//        N3.left = N6;
//        N3.right = N7;
//        N4.left = N8;
//
//        BT.root = N1;

//        BT.preOrederTraversal(N1);
//
//        System.out.println();
//
//        BT.inOrederTraversal(N1);
//
//        System.out.println();
//
//        BT.postOrederTraversal(N1);
//
//        System.out.println();
//
//        BT.levelOrderTraversal();

//        BT.searchTree("N3");
//
//        BT.searchTree("N9");

//        BT.insertNode("A");
//        BT.insertNode("B");
//        BT.insertNode("C");
//        System.out.println(BT.root.left.value);


        //-----------------------------------------------------------------------------------------------------------------------


        BinaryTreeArray bta = new BinaryTreeArray(9);

        bta.insert("N1");
        bta.insert("N2");
        bta.insert("N3");
        bta.insert("N4");
        bta.insert("N5");
        bta.insert("N6");
        bta.insert("N7");
        bta.insert("N8");
        bta.insert("N9");

        System.out.println(bta.lastUsedIndex);

        bta.preOrderTraversal(1);

        System.out.println();

        bta.postOrderTraversal(1);

        System.out.println();

        bta.inOrderTraversal(1);

        System.out.println();

        bta.levelOrderTraversal();

        bta.search("N5");

        bta.deleteNode("N5");

        bta.levelOrderTraversal();

        bta.deleteBT();




    }
}