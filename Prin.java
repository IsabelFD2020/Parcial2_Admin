public class Prin {

    public static void main (String []args){
        String mensaje = "Hola Soy Isabel";
        char array[] = mensaje.toCharArray();
        for(int i = 0; i< array.length; i++)
        {
            array[i] = (char) (array[i] + (char) 10);
        }
        String encriptacion = String.valueOf(array);
        System.out.println(encriptacion);

        char arrayDes [] = encriptacion.toCharArray();
        for(int i=0 ; i< arrayDes.length ; i++ )
        {
            arrayDes[i] = (char)(arrayDes[i] - (char) 10);
        }
         String desecriptado = String.valueOf(arrayDes);

        System.out.println(desecriptado);
        }
    }

