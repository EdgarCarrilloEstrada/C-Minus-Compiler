/* Generated By:JavaCC: Do not edit this line. cminusparser.java */
public class cminusparser implements cminusparserConstants {
    public static void main(String [] args) throws ParseException{
            cminusparser anLex = new cminusparser(System.in);
            anLex.Ejecucion();
            System.out.println("\n\nAnalysis has ended successfully!");
}

  static final public void Ejecucion() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CONDICIONAL_IF:
        jj_consume_token(CONDICIONAL_IF);
        break;
      case CONDICIONAL_ELSE:
        jj_consume_token(CONDICIONAL_ELSE);
        break;
      case DATO_INT:
        jj_consume_token(DATO_INT);
        break;
      case DATO_FLOAT:
        jj_consume_token(DATO_FLOAT);
        break;
      case DATO_CHAR:
        jj_consume_token(DATO_CHAR);
        break;
      case RETORNAR_RETURN:
        jj_consume_token(RETORNAR_RETURN);
        break;
      case VACIO_VOID:
        jj_consume_token(VACIO_VOID);
        break;
      case CICLO_WHILE:
        jj_consume_token(CICLO_WHILE);
        break;
      case SIMBOLO_MAS:
        jj_consume_token(SIMBOLO_MAS);
        break;
      case SIMBOLO_MENOS:
        jj_consume_token(SIMBOLO_MENOS);
        break;
      case SIMBOLO_POR:
        jj_consume_token(SIMBOLO_POR);
        break;
      case SIMBOLO_DIVISION:
        jj_consume_token(SIMBOLO_DIVISION);
        break;
      case SIMBOLO_MODULO:
        jj_consume_token(SIMBOLO_MODULO);
        break;
      case SIMBOLO_MENOR_QUE:
        jj_consume_token(SIMBOLO_MENOR_QUE);
        break;
      case SIMBOLO_MENOR_IGUAL:
        jj_consume_token(SIMBOLO_MENOR_IGUAL);
        break;
      case SIMBOLO_MAYOR_QUE:
        jj_consume_token(SIMBOLO_MAYOR_QUE);
        break;
      case SIMBOLO_MAYOR_IGUAL:
        jj_consume_token(SIMBOLO_MAYOR_IGUAL);
        break;
      case SIMBOLO_COMPARACION:
        jj_consume_token(SIMBOLO_COMPARACION);
        break;
      case SIMBOLO_DIFERENTE:
        jj_consume_token(SIMBOLO_DIFERENTE);
        break;
      case SIMBOLO_ASIGNACION:
        jj_consume_token(SIMBOLO_ASIGNACION);
        break;
      case SIMBOLO_PUNTO_Y_COMA:
        jj_consume_token(SIMBOLO_PUNTO_Y_COMA);
        break;
      case SIMBOLO_COMA:
        jj_consume_token(SIMBOLO_COMA);
        break;
      case SIMBOLO_PARENTESIS_ABIERTO:
        jj_consume_token(SIMBOLO_PARENTESIS_ABIERTO);
        break;
      case SIMBOLO_PARENTESIS_CERRADO:
        jj_consume_token(SIMBOLO_PARENTESIS_CERRADO);
        break;
      case SIMBOLO_CORCHETE_ABIERTO:
        jj_consume_token(SIMBOLO_CORCHETE_ABIERTO);
        break;
      case SIMBOLO_CORCHETE_CERRADO:
        jj_consume_token(SIMBOLO_CORCHETE_CERRADO);
        break;
      case SIMBOLO_LLAVE_ABIERTA:
        jj_consume_token(SIMBOLO_LLAVE_ABIERTA);
        break;
      case SIMBOLO_LLAVE_CERRADA:
        jj_consume_token(SIMBOLO_LLAVE_CERRADA);
        break;
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CONDICIONAL_IF:
      case CONDICIONAL_ELSE:
      case DATO_INT:
      case DATO_FLOAT:
      case DATO_CHAR:
      case RETORNAR_RETURN:
      case VACIO_VOID:
      case CICLO_WHILE:
      case SIMBOLO_MAS:
      case SIMBOLO_MENOS:
      case SIMBOLO_POR:
      case SIMBOLO_DIVISION:
      case SIMBOLO_MODULO:
      case SIMBOLO_MENOR_QUE:
      case SIMBOLO_MENOR_IGUAL:
      case SIMBOLO_MAYOR_QUE:
      case SIMBOLO_MAYOR_IGUAL:
      case SIMBOLO_COMPARACION:
      case SIMBOLO_DIFERENTE:
      case SIMBOLO_ASIGNACION:
      case SIMBOLO_PUNTO_Y_COMA:
      case SIMBOLO_COMA:
      case SIMBOLO_PARENTESIS_ABIERTO:
      case SIMBOLO_PARENTESIS_CERRADO:
      case SIMBOLO_CORCHETE_ABIERTO:
      case SIMBOLO_CORCHETE_CERRADO:
      case SIMBOLO_LLAVE_ABIERTA:
      case SIMBOLO_LLAVE_CERRADA:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
    }
    jj_consume_token(0);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public cminusparserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1ffffffe,0x1ffffffe,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public cminusparser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public cminusparser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new cminusparserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public cminusparser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new cminusparserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public cminusparser(cminusparserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(cminusparserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List jj_expentries = new java.util.ArrayList();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[34];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 34; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
