import javax.swing.*;

public class SignIn {

    public User singIn(){

        Object[] options = {"Estudante", "Professor", "Adminstrador"};

        String choice = (String) JOptionPane.showInputDialog(null, "Qual tipo de usuário?", "Escolha o tipo", JOptionPane.PLAIN_MESSAGE, null, options, "Estudante");

        String name = JOptionPane.showInputDialog("Qual o seu nome?");
        
        /*
        panel.add(new JLabel("Informe o ID: "));
        JTextField id = new JTextField(50);
        panel.add(id);
        */
        User newUser;

        if(choice == "Estudante"){
            String data = JOptionPane.showInputDialog("Qual sua matricula?");
            newUser = new Student(User.getQtdUser(), name, data);
        }
        else if(choice == "Professor"){
            Sector data;
            Object[] sectors = {"Matematica", "Portugues", "Biologia", "Fisica", "Quimica", "Historia", "Geografia"};
            String dataString = (String) JOptionPane.showInputDialog(null, "Qual sua disciplina", "Escolha sua materia", JOptionPane.PLAIN_MESSAGE, null, sectors, "");

            data = new Sector(Sector.getQtdSector(), dataString);

            JOptionPane.showInputDialog("Qual sua disciplina?");

            newUser = new Teacher(User.getQtdUser(), name, data);
        }
        else{
            String data = JOptionPane.showInputDialog("Qual sua ?");
            newUser = new Student(User.getQtdUser(), name, data);
        }
        return newUser;
    }
}
















/* 
        // diálogo padrão
        JOptionPane.showMessageDialog(null, "Exemplo diálogo de informação");
        // diálogo de erro
        JOptionPane.showMessageDialog(null, "Exemplo de diálogo de erro","Título do erro", JOptionPane.ERROR_MESSAGE);
        // diálogo de confirmação
        Integer numero = JOptionPane.showConfirmDialog(null, "Você confirma?", "Você confirma?",JOptionPane.YES_NO_OPTION); //0 = Sim //1 =Não
        JOptionPane.showMessageDialog(null, "Numero do sim" + numero);
        //diálogo de requisição de dados
        String inputValue = JOptionPane.showInputDialog("Qual o seu nome?");
        // diálogo de requisição com dados previamente definidos
        Object[] opcoes = {"20", "18", "19"};
        String s = (String) JOptionPane.showInputDialog(null, "Qual desses números é ímpar?", "Escolha o número", JOptionPane.PLAIN_MESSAGE, null, opcoes, "20");
*/


        /*JOptionPane.showOptionDialog(null,
                 "Selecione o que deseja fazer",
                 "SISTEMA DE RESERVAS",
                 JOptionPane.YES_NO_CANCEL_OPTION,
                 JOptionPane.PLAIN_MESSAGE,
                 null,
                 buttons,
                 null);*/

                 /*
                  * 

                  Object[] options1 = { "Try This Number", "Choose A Random Number",
                "Quit" };

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter number between 0 and 1000"));
        JTextField textField = new JTextField(10);
        panel.add(textField);

        int result = JOptionPane.showOptionDialog(null, panel, "Enter a Number",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options1, null);
        if (result == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, textField.getText());
        }
                  */