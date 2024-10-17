public class exceptionHandling4 {
    public static void main(String[] args) {
        System.out.println(m());
    }

        public static int m() {
            System.out.println("m1");

            try {
                System.out.println(10 / 0);
                return 56;
            } catch (Exception e) {
                System.out.println("catch");
                return 855;
            }
            finally {
                return 764;
            }
        }
        }