//Crea una función DividePorCero.
// Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será
// capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
// mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".


public class divisionCero {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int resutado = a / b;
            System.out.println(resutado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse" + e.getMessage()+ "" +  e.getClass());
        }catch (Exception e){
            System.out.println("Demo de codigo" + e.getMessage() + e.getClass());
        }
    }
}