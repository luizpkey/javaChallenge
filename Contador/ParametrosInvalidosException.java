public class ParametrosInvalidosException extends Exception {
   public ParametrosInvalidosException(String blah) {
      super(blah);

   }

   @Override
   public String toString() {
      return " O segundo parâmetro deve ser maior que o primeiro";
   }
}