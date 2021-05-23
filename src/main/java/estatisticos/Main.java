package estatisticos;
import java.util.*;
public class Main {
 public static void main(String[] args) {
 System.out.println("\nCALCULOS ESTATÍSTICOS\n");
 Scanner teclado = new Scanner(System.in);
 boolean error;
 int m, n;
 do {
 try {
 error = false;
 System.out.print("Teclea m (>= 0): \n");
 m = teclado.nextInt();
 System.out.print("Teclea n (>= 0 y <= m): \n");
 n = teclado.nextInt();
 Estatisticos es = new Estatisticos(m, n);
 System.out.printf("Permutacións(%d) = %f\n",n, es.factorial(n));
 System.out.printf("Permutacións(%d) = %f\n",m, es.factorial(m));
 System.out.printf("Variacións(%d,%d) = %f\n",m, n,
es.variacions());
 System.out.printf("Combinacións(%d,%d) = %f\n",m, n,
es.combinacions());
 System.out.printf("Variacións con repetición(%d,%d)= %f\n",m, n,
es.variacions_repeticion());
 } catch (NumberFormatException e) {
 teclado.nextLine(); //para limpar INTRO do buffer de teclado
 System.out.println("Erro na conversión");
 error = true;
 } catch (InputMismatchException e) {
 teclado.nextLine(); //para limpar INTRO do buffer de teclado
 System.out.println("Erro. O dato tecleado non é válido");
 error = true;
 } catch (Exception e) {
 teclado.nextLine(); //para limpar INTRO do buffer de teclado
 System.out.println(e.getMessage()); // Amosa o erro
 error = true;
 }
 } while (error);
 }
}
