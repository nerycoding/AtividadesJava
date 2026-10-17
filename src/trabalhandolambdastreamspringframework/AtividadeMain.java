package trabalhandolambdastreamspringframework;

import tools.jackson.databind.ObjectMapper;
import trabalhandolambdastreamspringframework.model.Tarefa;

import java.io.File;

public class AtividadeMain {



    static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa();
        tarefa1.setDescricao("Estudar Java");
        tarefa1.setConcluida(false);
        tarefa1.setPessoaResponsavel("João");
        ObjectMapper objectMapper = new ObjectMapper();


        try{
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/trabalhandolambdastreamspringframework/tarefa.json"), tarefa1);
            Tarefa tarefa2 = objectMapper.readValue(new File("src/trabalhandolambdastreamspringframework/tarefa.json"), Tarefa.class);
            System.out.println(tarefa2.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
