/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge15;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(20);
        binarySearchTree.add(8);
        binarySearchTree.add(12);
        binarySearchTree.add(32);

        binarySearchTree.contains(8);
    }
}