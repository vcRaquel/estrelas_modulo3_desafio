package br.com.zup;

public class ValidaDado {
    //preferi criar uma classe para dar a possibilidade de futuramente poder validar outros dados como cpf, data, etc
    //validar email
    public static void validarEmail(String email)throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email inválido");
        }
    }

    public static String tratarCpf(String cpf){
        String cpfTratado = cpf.replaceAll("\\s","");//verificar se ficou redundante ou se é necessário
        cpfTratado = cpf.replaceAll("[^0-9]+",""); //transformar tudo que não for números de 0 a 9 em ""
        return cpfTratado;
    }
}
