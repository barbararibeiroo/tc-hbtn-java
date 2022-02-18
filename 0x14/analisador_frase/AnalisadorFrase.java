import java.util.TreeMap;

public class AnalisadorFrase {

	  public static TreeMap<String, Integer> contagemPalavras(String palavras) {
          
          TreeMap<String, Integer> map = new TreeMap<>();
          
          palavras = palavras.replace("?", "");
          palavras = palavras.replace("!", "");
          palavras = palavras.replace(".", "");
          
          
          String[] teste = palavras.split(" ");
          
          int cont=0;
          
          for(int i = 0; i < teste.length; i++) {
                  for(int j = 0; j < teste.length; j++) {
                          if(teste[i].equalsIgnoreCase(teste[j])) {
                                  cont++;
                          }
                  }
                  
                  map.put(teste[i].toLowerCase(), cont);
                  cont=0;
          }
          
          return map;
  }

}

