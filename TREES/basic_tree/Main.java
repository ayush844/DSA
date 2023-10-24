public class Main {
    public static void main(String[] args) {

        TreeNode drinks = new TreeNode("Drinks");

        TreeNode hot = new TreeNode("Hot");

        TreeNode cold = new TreeNode("Cold");

        TreeNode tea = new TreeNode("Tea");

        TreeNode coffee = new TreeNode("Coffee");

        TreeNode nonalcoholic = new TreeNode("non-alcoholic");

        TreeNode alcoholic = new TreeNode("alcoholic");

        drinks.addChild(hot);

        drinks.addChild(cold);

        hot.addChild(tea);

        hot.addChild(coffee);

        cold.addChild(nonalcoholic);

        cold.addChild(alcoholic);


        System.out.println(drinks.print(0));
    }
}