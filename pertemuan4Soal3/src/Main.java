import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Main {
    public static void main(String[] args) {
        // 1. Buat object Product dengan stock 10
        Product product = new Product("Laptop", 15000000, 10);

        // 2. Buat object Sales
        Sales sales = new Sales(product);

        // 3. Penjualan produk dengan quantity 5
        sales.sellProduct(5);

        // 4. Restock produk
        sales.restockProduct(10);

        // 5. Memperbarui harga produk
        sales.updateProductPrice(14000000);

        // 6. Memperbarui harga dengan nilai negatif
        sales.updateProductPrice(-5000);
    }
}
