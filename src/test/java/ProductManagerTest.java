import java.util.Scanner;

public class ProductManagerTest {
    public static void main(String[] args) {
        ProductManager product = new ProductManager();
        Scanner input = new Scanner(System.in);
        int choose;

        do {
            System.out.println("List of products");
            System.out.println("1. More products");
            System.out.println("2. Edit product information by id");
            System.out.println("3. Remove products by id");
            System.out.println("4. Display product list");
            System.out.println("5. Search for products by name");
            System.out.println("6. Sort ascending by price");
            System.out.println("7. Sort descending by price");
            System.out.println("0. Exit!");
            choose = input.nextInt();

            switch (choose) {
                case 1:
                    product.addNewProduct();
                    break;
                case 2:
                    product.editProduct();
                    break;
                case 3:
                    product.deleteProductId();
                    break;
                case 4:
                    product.displayProductList();
                    break;
                case 5:
                    product.searchProductName();
                    break;
                case 6:
                    product.sortUpAscending();
                    break;
                case 7:
                    product.sortedDescending();
            }
        } while (choose != 0);
    }
}
