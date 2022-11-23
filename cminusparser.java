/* Generated By:JavaCC: Do not edit this line. cminusparser.java */
import java.util.*;

public class cminusparser implements cminusparserConstants {

    static Hashtable<String,String> contenedor = new Hashtable<String,String>();

    public static void main(String [] args) throws ParseException{
            cminusparser anLex = new cminusparser(System.in);
            anLex.Inicio();
            mostrar();
            System.out.println("\n\nAnalysis has ended successfully!");

    }

    static void guardar(String Id, String tipo){
        Enumeration llaves = contenedor.keys();
        while (llaves.hasMoreElements()) {
            if(llaves.nextElement().equals(Id)){
                System.out.println("Repeticion de declaraci\u00c3\u00b3n en el identificador: " + Id);
            }
        }

        contenedor.put(Id, tipo);
        //System.out.println(""+"Id: " + Id + " Corresponde: " + contenedor.get(Id));
    }

    static void mostrar (){
        Enumeration llaves = contenedor.keys();
        while (llaves.hasMoreElements()) {
            System.out.println(""+"Keys: " + llaves.nextElement() );
        }
    }

  final public void Inicio() throws ParseException {
    label_1:
    while (true) {
      program();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DATO_INT:
      case DATO_FLOAT:
      case DATO_CHAR:
      case VACIO_VOID:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
    }
    jj_consume_token(0);
  }

// GRAMATICA EN LINEA 1
  final public void program() throws ParseException {
    declaration_list();
  }

// GRAMATICA EN LINEA 2 (ARREGLADA)
  final public void declaration_list() throws ParseException {
    declaration();
    declaration_list_prima();
  }

//GRAMATICA EN LINEA 2 (ARREGLADA)
  final public void declaration_list_prima() throws ParseException {
    label_2:
    while (true) {
      if (jj_2_1(20)) {
        ;
      } else {
        break label_2;
      }
      declaration();
      declaration_list_prima();
    }
  }

//GRAMATICA EN LINEA 3
  final public void declaration() throws ParseException {
    if (jj_2_2(20)) {
      var_declaration();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DATO_INT:
      case DATO_FLOAT:
      case DATO_CHAR:
      case VACIO_VOID:
        fun_declaration();
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

//GRAMATICA EN LINEA 4
//ARREGLAR PARA QUE DETECTE ARREGLOS INDIVIDUALES
  final public void var_declaration() throws ParseException {
    type_specifier();
    jj_consume_token(IDENTIFICADOR);
                                      guardar(token.image, "Declaraci\u00c3\u00b3n de variable");
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SIMBOLO_COMA:
      case SIMBOLO_CORCHETE_ABIERTO:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SIMBOLO_CORCHETE_ABIERTO:
        jj_consume_token(SIMBOLO_CORCHETE_ABIERTO);
        jj_consume_token(NUMERO_ENTERO);
        jj_consume_token(SIMBOLO_CORCHETE_CERRADO);
        break;
      case SIMBOLO_COMA:
        jj_consume_token(SIMBOLO_COMA);
        jj_consume_token(IDENTIFICADOR);
                                                                                                                                                                                                    guardar(token.image, "Declaraci\u00c3\u00b3n de variable");
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(SIMBOLO_PUNTO_Y_COMA);
  }

//GRAMATICA EN LINEA 5
  final public void type_specifier() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case DATO_INT:
      jj_consume_token(DATO_INT);
      break;
    case DATO_FLOAT:
      jj_consume_token(DATO_FLOAT);
      break;
    case DATO_CHAR:
      jj_consume_token(DATO_CHAR);
      break;
    case VACIO_VOID:
      jj_consume_token(VACIO_VOID);
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//GRAMATICA EN LINEA 6
  final public void fun_declaration() throws ParseException {
    type_specifier();
    jj_consume_token(IDENTIFICADOR);
                                      guardar(token.image, "Declaraci\u00c3\u00b3n de funcion");
    jj_consume_token(SIMBOLO_PARENTESIS_ABIERTO);
    params();
    jj_consume_token(SIMBOLO_PARENTESIS_CERRADO);
    compound_stmt();

  }

//GRAMATICA EN LINEA 7
  final public void params() throws ParseException {
    if (jj_2_3(20)) {
      param_list();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VACIO_VOID:
        jj_consume_token(VACIO_VOID);
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

//GRAMATICA EN LINEA 8 (ARREGLADA)
  final public void param_list() throws ParseException {
    param();
    param_list_prima();
  }

//GRAMATICA EN LINEA 8 (ARREGLADA)
  final public void param_list_prima() throws ParseException {
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SIMBOLO_COMA:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_4;
      }
      jj_consume_token(SIMBOLO_COMA);
      param();
    }
  }

//GRAMATICA EN LINEA 9
  final public void param() throws ParseException {
    type_specifier();
    jj_consume_token(IDENTIFICADOR);
                                      guardar(token.image, "Declaraci\u00c3\u00b3n de parametro");
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SIMBOLO_CORCHETE_ABIERTO:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_5;
      }
      jj_consume_token(SIMBOLO_CORCHETE_ABIERTO);
      jj_consume_token(SIMBOLO_CORCHETE_CERRADO);
                                                                                                                                                  guardar(token.image, "Declaraci\u00c3\u00b3n de parametro con arreglo");
    }
  }

//GRAMATICA EN LINEA 10
  final public void compound_stmt() throws ParseException {
    jj_consume_token(SIMBOLO_LLAVE_ABIERTA);
    local_declarations();
    statement_list();
    jj_consume_token(SIMBOLO_LLAVE_CERRADA);
  }

//GRAMATICA EN LINEA 11 (ARREGLADA)
  final public void local_declarations() throws ParseException {
    local_declarations_prima();
  }

//GRAMATICA EN LINEA 11 (ARREGLADA)
  final public void local_declarations_prima() throws ParseException {
    label_6:
    while (true) {
      if (jj_2_4(20)) {
        ;
      } else {
        break label_6;
      }
      var_declaration();
      local_declarations();
    }
  }

//GRAMATICA EN LINEA 12 (ARREGLADA)
  final public void statement_list() throws ParseException {
    statement_list_prima();
  }

//GRAMATICA EN LINEA 12 (ARREGLADA)
  final public void statement_list_prima() throws ParseException {
    label_7:
    while (true) {
      if (jj_2_5(20)) {
        ;
      } else {
        break label_7;
      }
      statement();
      statement_list_prima();
    }
  }

//GRAMATICA EN LINEA 13
  final public void statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case RETORNAR_RETURN:
      return_stmt();
      break;
    case SIMBOLO_PUNTO_Y_COMA:
    case SIMBOLO_PARENTESIS_ABIERTO:
    case NUMERO_ENTERO:
    case NUMERO_REAL:
    case CARACTER:
    case IDENTIFICADOR:
      expression_stmt();
      break;
    case SIMBOLO_LLAVE_ABIERTA:
      compound_stmt();
      break;
    case CONDICIONAL_IF:
      selection_stmt();
      break;
    case CICLO_WHILE:
      iteration_stmt();
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//GRAMATICA EN LINEA 14
  final public void expression_stmt() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SIMBOLO_PARENTESIS_ABIERTO:
    case NUMERO_ENTERO:
    case NUMERO_REAL:
    case CARACTER:
    case IDENTIFICADOR:
      expression();
      jj_consume_token(SIMBOLO_PUNTO_Y_COMA);
      break;
    case SIMBOLO_PUNTO_Y_COMA:
      jj_consume_token(SIMBOLO_PUNTO_Y_COMA);
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//GRAMATICA EN LINEA 15
  final public void selection_stmt() throws ParseException {
    parte_if();
    parte_else();
  }

  final public void parte_if() throws ParseException {
    jj_consume_token(CONDICIONAL_IF);
    jj_consume_token(SIMBOLO_PARENTESIS_ABIERTO);
    expression();
    jj_consume_token(SIMBOLO_PARENTESIS_CERRADO);
    statement();
  }

  final public void parte_else() throws ParseException {
    label_8:
    while (true) {
      if (jj_2_6(20)) {
        ;
      } else {
        break label_8;
      }
      jj_consume_token(CONDICIONAL_ELSE);
      statement();
    }
  }

//GRAMATICA EN LINEA 16
  final public void iteration_stmt() throws ParseException {
    jj_consume_token(CICLO_WHILE);
    jj_consume_token(SIMBOLO_PARENTESIS_ABIERTO);
    expression();
    jj_consume_token(SIMBOLO_PARENTESIS_CERRADO);
    statement();
  }

//GRAMATICA EN LINEA 17
  final public void return_stmt() throws ParseException {
    jj_consume_token(RETORNAR_RETURN);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SIMBOLO_PUNTO_Y_COMA:
      jj_consume_token(SIMBOLO_PUNTO_Y_COMA);
      break;
    case SIMBOLO_PARENTESIS_ABIERTO:
    case NUMERO_ENTERO:
    case NUMERO_REAL:
    case CARACTER:
    case IDENTIFICADOR:
      expression();
      jj_consume_token(SIMBOLO_PUNTO_Y_COMA);
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//GRAMATICA EN LINEA 18
  final public void expression() throws ParseException {
    if (jj_2_7(20)) {
      var();
      jj_consume_token(SIMBOLO_ASIGNACION);
      expression();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SIMBOLO_PARENTESIS_ABIERTO:
      case NUMERO_ENTERO:
      case NUMERO_REAL:
      case CARACTER:
      case IDENTIFICADOR:
        simple_expression();
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

//GRAMATICA EN LINEA 19
  final public void var() throws ParseException {
    jj_consume_token(IDENTIFICADOR);
    var_extra();
  }

  final public void var_extra() throws ParseException {
    label_9:
    while (true) {
      if (jj_2_8(20)) {
        ;
      } else {
        break label_9;
      }
      jj_consume_token(SIMBOLO_CORCHETE_ABIERTO);
      expression();
      jj_consume_token(SIMBOLO_CORCHETE_CERRADO);
    }
  }

//GRAMATICA EN LINEA 20
  final public void simple_expression() throws ParseException {
    if (jj_2_9(20)) {
      additive_expression();
      relop();
      additive_expression();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SIMBOLO_PARENTESIS_ABIERTO:
      case NUMERO_ENTERO:
      case NUMERO_REAL:
      case CARACTER:
      case IDENTIFICADOR:
        additive_expression();
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

//GRAMATICA EN LINEA 21
  final public void relop() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SIMBOLO_MENOR_IGUAL:
      jj_consume_token(SIMBOLO_MENOR_IGUAL);
      break;
    case SIMBOLO_MENOR_QUE:
      jj_consume_token(SIMBOLO_MENOR_QUE);
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
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//GRAMATICA EN LINEA 22 (ARREGLADA)
  final public void additive_expression() throws ParseException {
    term();
    additive_expression_prima();
  }

//GRAMATICA EN LINEA 22 (ARREGLADA)
  final public void additive_expression_prima() throws ParseException {
    label_10:
    while (true) {
      if (jj_2_10(20)) {
        ;
      } else {
        break label_10;
      }
      addop();
      term();
      additive_expression_prima();
    }
  }

//GRAMATICA EN LINEA 23
  final public void addop() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SIMBOLO_MAS:
      jj_consume_token(SIMBOLO_MAS);
      break;
    case SIMBOLO_MENOS:
      jj_consume_token(SIMBOLO_MENOS);
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//GRAMATICA EN LINEA 24 (ARREGLADA)
  final public void term() throws ParseException {
    factor();
    term_prima();
  }

//GRAMATICA EN LINEA 24 (ARREGLADA)
  final public void term_prima() throws ParseException {
    label_11:
    while (true) {
      if (jj_2_11(20)) {
        ;
      } else {
        break label_11;
      }
      mulop();
      factor();
      term_prima();
    }
  }

//GRAMATICA EN LINEA 25
  final public void mulop() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SIMBOLO_POR:
      jj_consume_token(SIMBOLO_POR);
      break;
    case SIMBOLO_DIVISION:
      jj_consume_token(SIMBOLO_DIVISION);
      break;
    case SIMBOLO_MODULO:
      jj_consume_token(SIMBOLO_MODULO);
      break;
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//GRAMATICA EN LINEA 26
  final public void factor() throws ParseException {
    if (jj_2_12(20)) {
      call();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SIMBOLO_PARENTESIS_ABIERTO:
        jj_consume_token(SIMBOLO_PARENTESIS_ABIERTO);
        expression();
        jj_consume_token(SIMBOLO_PARENTESIS_CERRADO);
        break;
      default:
        jj_la1[16] = jj_gen;
        if (jj_2_13(20)) {
          var();
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case NUMERO_ENTERO:
            jj_consume_token(NUMERO_ENTERO);
            break;
          case NUMERO_REAL:
            jj_consume_token(NUMERO_REAL);
            break;
          case CARACTER:
            jj_consume_token(CARACTER);
            break;
          default:
            jj_la1[17] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      }
    }
  }

//GRAMATICA EN LINEA 27
  final public void call() throws ParseException {
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(SIMBOLO_PARENTESIS_ABIERTO);
    args();
    jj_consume_token(SIMBOLO_PARENTESIS_CERRADO);
  }

//GRAMATICA EN LINEA 28
  final public void args() throws ParseException {
    label_12:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SIMBOLO_PARENTESIS_ABIERTO:
      case NUMERO_ENTERO:
      case NUMERO_REAL:
      case CARACTER:
      case IDENTIFICADOR:
        ;
        break;
      default:
        jj_la1[18] = jj_gen;
        break label_12;
      }
      arg_list();
    }
  }

//GRAMATICA EN LINEA 29 (ARREGLADA)
  final public void arg_list() throws ParseException {
    expression();
    arg_list_prima();
  }

//GRAMATICA EN LINEA 29 (ARREGLADA)
  final public void arg_list_prima() throws ParseException {
    label_13:
    while (true) {
      if (jj_2_14(20)) {
        ;
      } else {
        break label_13;
      }
      jj_consume_token(SIMBOLO_COMA);
      expression();
      arg_list_prima();
    }
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  private boolean jj_2_7(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  private boolean jj_2_8(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  private boolean jj_2_9(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  private boolean jj_2_10(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  private boolean jj_2_11(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_11(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  private boolean jj_2_12(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_12(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  private boolean jj_2_13(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_13(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  private boolean jj_2_14(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_14(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  private boolean jj_3_11() {
    if (jj_3R_28()) return true;
    if (jj_3R_29()) return true;
    if (jj_3R_30()) return true;
    return false;
  }

  private boolean jj_3_4() {
    if (jj_3R_16()) return true;
    if (jj_3R_18()) return true;
    return false;
  }

  private boolean jj_3R_30() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_11()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_38() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_4()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_26() {
    if (jj_3R_29()) return true;
    if (jj_3R_30()) return true;
    return false;
  }

  private boolean jj_3R_61() {
    if (jj_3R_22()) return true;
    if (jj_scan_token(SIMBOLO_PUNTO_Y_COMA)) return true;
    return false;
  }

  private boolean jj_3R_18() {
    if (jj_3R_38()) return true;
    return false;
  }

  private boolean jj_3R_43() {
    if (jj_3R_57()) return true;
    return false;
  }

  private boolean jj_3R_25() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(9)) {
    jj_scanpos = xsp;
    if (jj_scan_token(10)) return true;
    }
    return false;
  }

  private boolean jj_3R_55() {
    if (jj_scan_token(SIMBOLO_LLAVE_ABIERTA)) return true;
    if (jj_3R_18()) return true;
    if (jj_3R_63()) return true;
    if (jj_scan_token(SIMBOLO_LLAVE_CERRADA)) return true;
    return false;
  }

  private boolean jj_3_10() {
    if (jj_3R_25()) return true;
    if (jj_3R_26()) return true;
    if (jj_3R_27()) return true;
    return false;
  }

  private boolean jj_3R_27() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_10()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_36() {
    if (jj_3R_34()) return true;
    if (jj_scan_token(IDENTIFICADOR)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_51()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_52() {
    if (jj_scan_token(SIMBOLO_COMA)) return true;
    if (jj_3R_36()) return true;
    return false;
  }

  private boolean jj_3R_33() {
    if (jj_3R_48()) return true;
    return false;
  }

  private boolean jj_3R_23() {
    if (jj_3R_26()) return true;
    if (jj_3R_27()) return true;
    return false;
  }

  private boolean jj_3R_37() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_52()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_51() {
    if (jj_scan_token(SIMBOLO_CORCHETE_ABIERTO)) return true;
    if (jj_scan_token(SIMBOLO_CORCHETE_CERRADO)) return true;
    return false;
  }

  private boolean jj_3R_24() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(15)) {
    jj_scanpos = xsp;
    if (jj_scan_token(14)) {
    jj_scanpos = xsp;
    if (jj_scan_token(16)) {
    jj_scanpos = xsp;
    if (jj_scan_token(17)) {
    jj_scanpos = xsp;
    if (jj_scan_token(18)) {
    jj_scanpos = xsp;
    if (jj_scan_token(19)) return true;
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_17() {
    if (jj_3R_36()) return true;
    if (jj_3R_37()) return true;
    return false;
  }

  private boolean jj_3R_42() {
    if (jj_3R_56()) return true;
    return false;
  }

  private boolean jj_3R_58() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_9()) {
    jj_scanpos = xsp;
    if (jj_3R_66()) return true;
    }
    return false;
  }

  private boolean jj_3_9() {
    if (jj_3R_23()) return true;
    if (jj_3R_24()) return true;
    if (jj_3R_23()) return true;
    return false;
  }

  private boolean jj_3R_60() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_3()) {
    jj_scanpos = xsp;
    if (jj_scan_token(7)) return true;
    }
    return false;
  }

  private boolean jj_3_3() {
    if (jj_3R_17()) return true;
    return false;
  }

  private boolean jj_3_8() {
    if (jj_scan_token(SIMBOLO_CORCHETE_ABIERTO)) return true;
    if (jj_3R_22()) return true;
    if (jj_scan_token(SIMBOLO_CORCHETE_CERRADO)) return true;
    return false;
  }

  private boolean jj_3R_44() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_8()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_48() {
    if (jj_3R_34()) return true;
    if (jj_scan_token(IDENTIFICADOR)) return true;
    if (jj_scan_token(SIMBOLO_PARENTESIS_ABIERTO)) return true;
    if (jj_3R_60()) return true;
    if (jj_scan_token(SIMBOLO_PARENTESIS_CERRADO)) return true;
    if (jj_3R_55()) return true;
    return false;
  }

  private boolean jj_3R_21() {
    if (jj_scan_token(IDENTIFICADOR)) return true;
    if (jj_3R_44()) return true;
    return false;
  }

  private boolean jj_3R_34() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(3)) {
    jj_scanpos = xsp;
    if (jj_scan_token(4)) {
    jj_scanpos = xsp;
    if (jj_scan_token(5)) {
    jj_scanpos = xsp;
    if (jj_scan_token(7)) return true;
    }
    }
    }
    return false;
  }

  private boolean jj_3R_41() {
    if (jj_3R_55()) return true;
    return false;
  }

  private boolean jj_3_7() {
    if (jj_3R_21()) return true;
    if (jj_scan_token(SIMBOLO_ASIGNACION)) return true;
    if (jj_3R_22()) return true;
    return false;
  }

  private boolean jj_3R_22() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_7()) {
    jj_scanpos = xsp;
    if (jj_3R_45()) return true;
    }
    return false;
  }

  private boolean jj_3R_16() {
    if (jj_3R_34()) return true;
    if (jj_scan_token(IDENTIFICADOR)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_35()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(SIMBOLO_PUNTO_Y_COMA)) return true;
    return false;
  }

  private boolean jj_3R_53() {
    if (jj_scan_token(RETORNAR_RETURN)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(21)) {
    jj_scanpos = xsp;
    if (jj_3R_61()) return true;
    }
    return false;
  }

  private boolean jj_3R_14() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3R_33()) return true;
    }
    return false;
  }

  private boolean jj_3_2() {
    if (jj_3R_16()) return true;
    return false;
  }

  private boolean jj_3R_57() {
    if (jj_scan_token(CICLO_WHILE)) return true;
    if (jj_scan_token(SIMBOLO_PARENTESIS_ABIERTO)) return true;
    if (jj_3R_22()) return true;
    if (jj_scan_token(SIMBOLO_PARENTESIS_CERRADO)) return true;
    if (jj_3R_19()) return true;
    return false;
  }

  private boolean jj_3R_49() {
    if (jj_scan_token(SIMBOLO_CORCHETE_ABIERTO)) return true;
    if (jj_scan_token(NUMERO_ENTERO)) return true;
    if (jj_scan_token(SIMBOLO_CORCHETE_CERRADO)) return true;
    return false;
  }

  private boolean jj_3R_35() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_49()) {
    jj_scanpos = xsp;
    if (jj_3R_50()) return true;
    }
    return false;
  }

  private boolean jj_3R_66() {
    if (jj_3R_23()) return true;
    return false;
  }

  private boolean jj_3_1() {
    if (jj_3R_14()) return true;
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3R_15() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_1()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3_6() {
    if (jj_scan_token(CONDICIONAL_ELSE)) return true;
    if (jj_3R_19()) return true;
    return false;
  }

  private boolean jj_3R_65() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_6()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_46() {
    if (jj_scan_token(SIMBOLO_PARENTESIS_ABIERTO)) return true;
    if (jj_3R_22()) return true;
    if (jj_scan_token(SIMBOLO_PARENTESIS_CERRADO)) return true;
    return false;
  }

  private boolean jj_3_14() {
    if (jj_scan_token(SIMBOLO_COMA)) return true;
    if (jj_3R_22()) return true;
    if (jj_3R_32()) return true;
    return false;
  }

  private boolean jj_3R_40() {
    if (jj_3R_54()) return true;
    return false;
  }

  private boolean jj_3R_32() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_14()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_64() {
    if (jj_scan_token(CONDICIONAL_IF)) return true;
    if (jj_scan_token(SIMBOLO_PARENTESIS_ABIERTO)) return true;
    if (jj_3R_22()) return true;
    if (jj_scan_token(SIMBOLO_PARENTESIS_CERRADO)) return true;
    if (jj_3R_19()) return true;
    return false;
  }

  private boolean jj_3R_67() {
    if (jj_3R_22()) return true;
    if (jj_3R_32()) return true;
    return false;
  }

  private boolean jj_3R_56() {
    if (jj_3R_64()) return true;
    if (jj_3R_65()) return true;
    return false;
  }

  private boolean jj_3R_59() {
    if (jj_3R_67()) return true;
    return false;
  }

  private boolean jj_3R_47() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_59()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_62() {
    if (jj_3R_22()) return true;
    if (jj_scan_token(SIMBOLO_PUNTO_Y_COMA)) return true;
    return false;
  }

  private boolean jj_3R_54() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_62()) {
    jj_scanpos = xsp;
    if (jj_scan_token(21)) return true;
    }
    return false;
  }

  private boolean jj_3R_50() {
    if (jj_scan_token(SIMBOLO_COMA)) return true;
    if (jj_scan_token(IDENTIFICADOR)) return true;
    return false;
  }

  private boolean jj_3R_31() {
    if (jj_scan_token(IDENTIFICADOR)) return true;
    if (jj_scan_token(SIMBOLO_PARENTESIS_ABIERTO)) return true;
    if (jj_3R_47()) return true;
    if (jj_scan_token(SIMBOLO_PARENTESIS_CERRADO)) return true;
    return false;
  }

  private boolean jj_3R_39() {
    if (jj_3R_53()) return true;
    return false;
  }

  private boolean jj_3R_19() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_39()) {
    jj_scanpos = xsp;
    if (jj_3R_40()) {
    jj_scanpos = xsp;
    if (jj_3R_41()) {
    jj_scanpos = xsp;
    if (jj_3R_42()) {
    jj_scanpos = xsp;
    if (jj_3R_43()) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_13() {
    if (jj_3R_21()) return true;
    return false;
  }

  private boolean jj_3R_45() {
    if (jj_3R_58()) return true;
    return false;
  }

  private boolean jj_3_5() {
    if (jj_3R_19()) return true;
    if (jj_3R_20()) return true;
    return false;
  }

  private boolean jj_3_12() {
    if (jj_3R_31()) return true;
    return false;
  }

  private boolean jj_3R_29() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_12()) {
    jj_scanpos = xsp;
    if (jj_3R_46()) {
    jj_scanpos = xsp;
    if (jj_3_13()) {
    jj_scanpos = xsp;
    if (jj_scan_token(32)) {
    jj_scanpos = xsp;
    if (jj_scan_token(33)) {
    jj_scanpos = xsp;
    if (jj_scan_token(34)) return true;
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_20() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_5()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_28() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(11)) {
    jj_scanpos = xsp;
    if (jj_scan_token(12)) {
    jj_scanpos = xsp;
    if (jj_scan_token(13)) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_63() {
    if (jj_3R_20()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public cminusparserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  /** Whether we are looking ahead. */
  private boolean jj_lookingAhead = false;
  private boolean jj_semLA;
  private int jj_gen;
  final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xb8,0xb8,0x10400000,0x10400000,0xb8,0x80,0x400000,0x10000000,0x44200142,0x4200000,0x4200000,0x4000000,0x4000000,0xfc000,0x600,0x3800,0x4000000,0x0,0x4000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x17,0x17,0x17,0x17,0x17,0x0,0x0,0x0,0x0,0x7,0x17,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[14];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public cminusparser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public cminusparser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new cminusparserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public cminusparser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new cminusparserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public cminusparser(cminusparserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(cminusparserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = jj_lookingAhead ? jj_scanpos : token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List jj_expentries = new java.util.ArrayList();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Iterator it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          exists = true;
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.add(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[51];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
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
    for (int i = 0; i < 51; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 14; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
            case 7: jj_3_8(); break;
            case 8: jj_3_9(); break;
            case 9: jj_3_10(); break;
            case 10: jj_3_11(); break;
            case 11: jj_3_12(); break;
            case 12: jj_3_13(); break;
            case 13: jj_3_14(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
