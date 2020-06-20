/* The following code was generated by JFlex 1.4.3 on 18/06/20 11:14 PM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 18/06/20 11:14 PM from the specification file
 * <tt>C:/Users/garci/Documents/NetBeansProjects/Octocom/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\3\1\43\1\6\1\36"+
    "\1\0\1\46\1\41\1\0\1\47\1\50\1\40\1\35\1\3\1\37"+
    "\1\0\1\4\12\2\1\55\1\56\1\45\1\34\1\44\2\0\22\1"+
    "\1\32\7\1\1\53\1\0\1\54\1\0\1\1\1\0\1\17\1\7"+
    "\1\15\1\25\1\12\1\24\1\23\1\16\1\13\2\1\1\21\1\31"+
    "\1\14\1\22\2\1\1\20\1\30\1\11\1\26\1\27\1\33\1\1"+
    "\1\10\1\1\1\51\1\42\1\52\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\15\2\1\10\1\11\1\12\1\13\1\14\3\15\2\16"+
    "\1\1\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\4\1\27\5\2\1\30\6\2\1\31\5\2"+
    "\1\16\1\32\1\15\1\0\3\2\1\33\10\2\1\34"+
    "\6\2\1\0\1\35\1\36\3\2\1\37\3\2\1\40"+
    "\2\2\1\3\3\2\1\41\1\2\1\42\2\2\1\0"+
    "\1\2\1\43\1\44\1\2\2\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\57\0\57"+
    "\0\u011a\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263"+
    "\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\57"+
    "\0\u03db\0\u040a\0\u0439\0\u0468\0\u037d\0\u0497\0\u04c6\0\u040a"+
    "\0\u04f5\0\57\0\57\0\57\0\57\0\57\0\57\0\57"+
    "\0\u0524\0\57\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f\0\136"+
    "\0\u063e\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787"+
    "\0\u07b6\0\u07e5\0\u0814\0\u0843\0\57\0\57\0\57\0\u0872"+
    "\0\u08a1\0\u08d0\0\u08ff\0\136\0\u092e\0\u095d\0\u098c\0\u09bb"+
    "\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\136\0\u0aa6\0\u0ad5\0\u0b04"+
    "\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\136\0\136\0\u0bef\0\u0c1e"+
    "\0\u0c4d\0\136\0\u0c7c\0\u0cab\0\u0cda\0\136\0\u0d09\0\u0d38"+
    "\0\57\0\u0d67\0\u0d96\0\u0dc5\0\u0dc5\0\u0df4\0\136\0\u0e23"+
    "\0\u0e52\0\u0e81\0\u0eb0\0\136\0\136\0\u0edf\0\57\0\136";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\3\1\12\1\13\1\14\1\3\1\15\3\3\1\16"+
    "\2\3\1\17\1\20\1\3\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\60\0\2\3\4\0\25\3"+
    "\25\0\1\4\57\0\1\5\57\0\1\51\27\0\1\52"+
    "\23\0\2\3\4\0\1\3\1\53\23\3\24\0\2\3"+
    "\4\0\11\3\1\54\13\3\24\0\2\3\4\0\12\3"+
    "\1\55\12\3\24\0\2\3\4\0\5\3\1\56\5\3"+
    "\1\57\1\3\1\60\7\3\24\0\2\3\4\0\7\3"+
    "\1\61\3\3\1\62\11\3\24\0\2\3\4\0\13\3"+
    "\1\63\11\3\24\0\2\3\4\0\10\3\1\64\1\3"+
    "\1\65\1\66\11\3\24\0\2\3\4\0\13\3\1\67"+
    "\11\3\24\0\2\3\4\0\13\3\1\70\11\3\24\0"+
    "\2\3\4\0\2\3\1\71\22\3\24\0\2\3\4\0"+
    "\10\3\1\72\14\3\24\0\2\3\4\0\2\3\1\73"+
    "\22\3\24\0\2\3\4\0\7\3\1\74\15\3\57\0"+
    "\1\75\56\0\1\52\1\76\55\0\1\52\2\0\1\76"+
    "\53\0\1\52\63\0\1\77\57\0\1\77\50\0\1\75"+
    "\7\0\1\75\46\0\1\75\10\0\1\75\50\0\1\100"+
    "\17\0\5\51\1\0\51\51\1\0\2\3\4\0\2\3"+
    "\1\101\22\3\24\0\2\3\4\0\17\3\1\102\5\3"+
    "\24\0\2\3\4\0\21\3\1\103\3\3\24\0\2\3"+
    "\4\0\2\3\1\104\3\3\1\105\16\3\24\0\2\3"+
    "\4\0\21\3\1\106\3\3\24\0\2\3\4\0\10\3"+
    "\1\107\14\3\24\0\2\3\4\0\5\3\1\110\11\3"+
    "\1\111\5\3\24\0\2\3\4\0\5\3\1\112\17\3"+
    "\24\0\2\3\4\0\12\3\1\113\12\3\24\0\2\3"+
    "\4\0\13\3\1\114\11\3\24\0\2\3\4\0\11\3"+
    "\1\115\13\3\24\0\2\3\4\0\17\3\1\116\5\3"+
    "\24\0\2\3\4\0\4\3\1\117\20\3\24\0\2\3"+
    "\4\0\16\3\1\120\6\3\24\0\2\3\4\0\4\3"+
    "\1\121\20\3\24\0\2\3\4\0\11\3\1\122\13\3"+
    "\24\0\2\3\4\0\4\3\1\123\20\3\25\0\1\124"+
    "\55\0\2\3\4\0\3\3\1\104\21\3\24\0\2\3"+
    "\4\0\3\3\1\125\21\3\24\0\2\3\4\0\3\3"+
    "\1\126\21\3\24\0\2\3\4\0\12\3\1\127\12\3"+
    "\24\0\2\3\4\0\2\3\1\130\22\3\24\0\2\3"+
    "\4\0\11\3\1\104\13\3\24\0\2\3\4\0\4\3"+
    "\1\131\20\3\24\0\2\3\4\0\2\3\1\132\22\3"+
    "\24\0\2\3\4\0\14\3\1\104\10\3\24\0\2\3"+
    "\4\0\21\3\1\102\3\3\24\0\2\3\4\0\10\3"+
    "\1\133\14\3\24\0\2\3\4\0\1\134\24\3\24\0"+
    "\2\3\4\0\16\3\1\104\6\3\24\0\2\3\4\0"+
    "\4\3\1\135\20\3\24\0\2\3\4\0\5\3\1\136"+
    "\17\3\24\0\2\3\4\0\4\3\1\137\20\3\24\0"+
    "\2\3\4\0\12\3\1\140\12\3\25\0\1\124\45\0"+
    "\1\141\7\0\2\3\4\0\17\3\1\142\5\3\24\0"+
    "\2\3\4\0\11\3\1\143\13\3\24\0\2\3\4\0"+
    "\13\3\1\144\11\3\24\0\2\3\4\0\2\3\1\104"+
    "\22\3\24\0\2\3\4\0\12\3\1\101\12\3\24\0"+
    "\2\3\4\0\13\3\1\145\11\3\24\0\2\3\4\0"+
    "\5\3\1\146\17\3\24\0\2\3\4\0\3\3\1\147"+
    "\21\3\24\0\2\3\4\0\16\3\1\150\6\3\24\0"+
    "\2\3\4\0\3\3\1\151\21\3\23\0\1\152\2\153"+
    "\2\152\1\0\1\152\25\153\23\152\1\0\2\3\4\0"+
    "\14\3\1\154\10\3\24\0\2\3\4\0\3\3\1\155"+
    "\21\3\24\0\2\3\4\0\10\3\1\156\14\3\41\0"+
    "\1\157\41\0\2\3\4\0\7\3\1\160\15\3\24\0"+
    "\2\3\4\0\22\3\1\145\2\3\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3854];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\2\11\17\1\1\11\11\1\7\11"+
    "\1\1\1\11\22\1\3\11\1\0\23\1\1\0\14\1"+
    "\1\11\10\1\1\0\4\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 132) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 37: break;
        case 22: 
          { lexeme=yytext(); return P_coma;
          }
        case 38: break;
        case 17: 
          { lexeme=yytext(); return Llave_a;
          }
        case 39: break;
        case 30: 
          { lexeme=yytext(); return Else;
          }
        case 40: break;
        case 6: 
          { return Linea;
          }
        case 41: break;
        case 28: 
          { lexeme=yytext(); return For;
          }
        case 42: break;
        case 36: 
          { lexeme=yytext(); return Include;
          }
        case 43: break;
        case 5: 
          { lexeme=yytext(); return Division;
          }
        case 44: break;
        case 14: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 45: break;
        case 13: 
          { lexeme=yytext(); return Op_logico;
          }
        case 46: break;
        case 23: 
          { lexeme = yytext(); return Op_atribucion;
          }
        case 47: break;
        case 26: 
          { lexeme = yytext(); return Op_incremento;
          }
        case 48: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 49: break;
        case 18: 
          { lexeme=yytext(); return Llave_c;
          }
        case 50: break;
        case 15: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 51: break;
        case 7: 
          { lexeme=yytext(); return Comillas;
          }
        case 52: break;
        case 19: 
          { lexeme = yytext(); return Corchete_a;
          }
        case 53: break;
        case 35: 
          { lexeme=yytext(); return Cadena;
          }
        case 54: break;
        case 25: 
          { lexeme=yytext(); return Do;
          }
        case 55: break;
        case 32: 
          { lexeme=yytext(); return Main;
          }
        case 56: break;
        case 11: 
          { lexeme=yytext(); return Resta;
          }
        case 57: break;
        case 27: 
          { lexeme=yytext(); return T_dato;
          }
        case 58: break;
        case 33: 
          { lexeme=yytext(); return Librerias;
          }
        case 59: break;
        case 31: 
          { lexeme=yytext(); return Cout;
          }
        case 60: break;
        case 16: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 61: break;
        case 12: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 62: break;
        case 10: 
          { lexeme=yytext(); return Hashtag;
          }
        case 63: break;
        case 20: 
          { lexeme = yytext(); return Corchete_c;
          }
        case 64: break;
        case 1: 
          { return ERROR;
          }
        case 65: break;
        case 8: 
          { lexeme=yytext(); return Igual;
          }
        case 66: break;
        case 21: 
          { lexeme=yytext(); return D_Puntos;
          }
        case 67: break;
        case 34: 
          { lexeme=yytext(); return While;
          }
        case 68: break;
        case 4: 
          { /*Ignore*/
          }
        case 69: break;
        case 29: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 70: break;
        case 24: 
          { lexeme=yytext(); return If;
          }
        case 71: break;
        case 9: 
          { lexeme=yytext(); return Suma;
          }
        case 72: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
