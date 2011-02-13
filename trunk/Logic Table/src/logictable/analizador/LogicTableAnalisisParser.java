// $ANTLR 3.3 Nov 30, 2010 12:45:30 LogicTableAnalisis.g 2011-02-12 21:09:32
package logictable.analizador;
 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LogicTableAnalisisParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OP_UNION", "OP_NEGACION", "OP_INTERSECCION", "OP_BICONDICIONAL", "OP_CONDICIONAL", "PARENT_AB", "PARENT_CE", "VARIABLE_A", "VARIABLE_B", "VARIABLE_C", "BLANCO"
    };
    public static final int EOF=-1;
    public static final int OP_UNION=4;
    public static final int OP_NEGACION=5;
    public static final int OP_INTERSECCION=6;
    public static final int OP_BICONDICIONAL=7;
    public static final int OP_CONDICIONAL=8;
    public static final int PARENT_AB=9;
    public static final int PARENT_CE=10;
    public static final int VARIABLE_A=11;
    public static final int VARIABLE_B=12;
    public static final int VARIABLE_C=13;
    public static final int BLANCO=14;

    // delegates
    // delegators


        public LogicTableAnalisisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LogicTableAnalisisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LogicTableAnalisisParser.tokenNames; }
    public String getGrammarFileName() { return "LogicTableAnalisis.g"; }


    public static class expresion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expresion"
    // LogicTableAnalisis.g:30:1: expresion : expBiCond ;
    public final LogicTableAnalisisParser.expresion_return expresion() throws RecognitionException {
        LogicTableAnalisisParser.expresion_return retval = new LogicTableAnalisisParser.expresion_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogicTableAnalisisParser.expBiCond_return expBiCond1 = null;



        try {
            // LogicTableAnalisis.g:32:11: ( expBiCond )
            // LogicTableAnalisis.g:32:13: expBiCond
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expBiCond_in_expresion278);
            expBiCond1=expBiCond();

            state._fsp--;

            adaptor.addChild(root_0, expBiCond1.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expresion"

    public static class expBiCond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expBiCond"
    // LogicTableAnalisis.g:33:1: expBiCond : expCond ( OP_BICONDICIONAL expCond )* ;
    public final LogicTableAnalisisParser.expBiCond_return expBiCond() throws RecognitionException {
        LogicTableAnalisisParser.expBiCond_return retval = new LogicTableAnalisisParser.expBiCond_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_BICONDICIONAL3=null;
        LogicTableAnalisisParser.expCond_return expCond2 = null;

        LogicTableAnalisisParser.expCond_return expCond4 = null;


        Object OP_BICONDICIONAL3_tree=null;

        try {
            // LogicTableAnalisis.g:34:11: ( expCond ( OP_BICONDICIONAL expCond )* )
            // LogicTableAnalisis.g:34:13: expCond ( OP_BICONDICIONAL expCond )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expCond_in_expBiCond288);
            expCond2=expCond();

            state._fsp--;

            adaptor.addChild(root_0, expCond2.getTree());
            // LogicTableAnalisis.g:34:21: ( OP_BICONDICIONAL expCond )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==OP_BICONDICIONAL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // LogicTableAnalisis.g:34:22: OP_BICONDICIONAL expCond
            	    {
            	    OP_BICONDICIONAL3=(Token)match(input,OP_BICONDICIONAL,FOLLOW_OP_BICONDICIONAL_in_expBiCond291); 
            	    OP_BICONDICIONAL3_tree = (Object)adaptor.create(OP_BICONDICIONAL3);
            	    root_0 = (Object)adaptor.becomeRoot(OP_BICONDICIONAL3_tree, root_0);

            	    pushFollow(FOLLOW_expCond_in_expBiCond294);
            	    expCond4=expCond();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expCond4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expBiCond"

    public static class expCond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expCond"
    // LogicTableAnalisis.g:35:1: expCond : expIntersec ( OP_CONDICIONAL expIntersec )* ;
    public final LogicTableAnalisisParser.expCond_return expCond() throws RecognitionException {
        LogicTableAnalisisParser.expCond_return retval = new LogicTableAnalisisParser.expCond_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_CONDICIONAL6=null;
        LogicTableAnalisisParser.expIntersec_return expIntersec5 = null;

        LogicTableAnalisisParser.expIntersec_return expIntersec7 = null;


        Object OP_CONDICIONAL6_tree=null;

        try {
            // LogicTableAnalisis.g:36:9: ( expIntersec ( OP_CONDICIONAL expIntersec )* )
            // LogicTableAnalisis.g:36:11: expIntersec ( OP_CONDICIONAL expIntersec )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expIntersec_in_expCond306);
            expIntersec5=expIntersec();

            state._fsp--;

            adaptor.addChild(root_0, expIntersec5.getTree());
            // LogicTableAnalisis.g:36:23: ( OP_CONDICIONAL expIntersec )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==OP_CONDICIONAL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // LogicTableAnalisis.g:36:24: OP_CONDICIONAL expIntersec
            	    {
            	    OP_CONDICIONAL6=(Token)match(input,OP_CONDICIONAL,FOLLOW_OP_CONDICIONAL_in_expCond309); 
            	    OP_CONDICIONAL6_tree = (Object)adaptor.create(OP_CONDICIONAL6);
            	    root_0 = (Object)adaptor.becomeRoot(OP_CONDICIONAL6_tree, root_0);

            	    pushFollow(FOLLOW_expIntersec_in_expCond312);
            	    expIntersec7=expIntersec();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expIntersec7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expCond"

    public static class expIntersec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expIntersec"
    // LogicTableAnalisis.g:37:1: expIntersec : expUnion ( OP_INTERSECCION expUnion )* ;
    public final LogicTableAnalisisParser.expIntersec_return expIntersec() throws RecognitionException {
        LogicTableAnalisisParser.expIntersec_return retval = new LogicTableAnalisisParser.expIntersec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_INTERSECCION9=null;
        LogicTableAnalisisParser.expUnion_return expUnion8 = null;

        LogicTableAnalisisParser.expUnion_return expUnion10 = null;


        Object OP_INTERSECCION9_tree=null;

        try {
            // LogicTableAnalisis.g:38:13: ( expUnion ( OP_INTERSECCION expUnion )* )
            // LogicTableAnalisis.g:38:15: expUnion ( OP_INTERSECCION expUnion )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expUnion_in_expIntersec324);
            expUnion8=expUnion();

            state._fsp--;

            adaptor.addChild(root_0, expUnion8.getTree());
            // LogicTableAnalisis.g:38:24: ( OP_INTERSECCION expUnion )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==OP_INTERSECCION) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // LogicTableAnalisis.g:38:25: OP_INTERSECCION expUnion
            	    {
            	    OP_INTERSECCION9=(Token)match(input,OP_INTERSECCION,FOLLOW_OP_INTERSECCION_in_expIntersec327); 
            	    OP_INTERSECCION9_tree = (Object)adaptor.create(OP_INTERSECCION9);
            	    root_0 = (Object)adaptor.becomeRoot(OP_INTERSECCION9_tree, root_0);

            	    pushFollow(FOLLOW_expUnion_in_expIntersec330);
            	    expUnion10=expUnion();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expUnion10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expIntersec"

    public static class expUnion_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expUnion"
    // LogicTableAnalisis.g:39:1: expUnion : expBase ( OP_UNION expBase )* ;
    public final LogicTableAnalisisParser.expUnion_return expUnion() throws RecognitionException {
        LogicTableAnalisisParser.expUnion_return retval = new LogicTableAnalisisParser.expUnion_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_UNION12=null;
        LogicTableAnalisisParser.expBase_return expBase11 = null;

        LogicTableAnalisisParser.expBase_return expBase13 = null;


        Object OP_UNION12_tree=null;

        try {
            // LogicTableAnalisis.g:40:10: ( expBase ( OP_UNION expBase )* )
            // LogicTableAnalisis.g:40:12: expBase ( OP_UNION expBase )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expBase_in_expUnion342);
            expBase11=expBase();

            state._fsp--;

            adaptor.addChild(root_0, expBase11.getTree());
            // LogicTableAnalisis.g:40:20: ( OP_UNION expBase )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==OP_UNION) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // LogicTableAnalisis.g:40:21: OP_UNION expBase
            	    {
            	    OP_UNION12=(Token)match(input,OP_UNION,FOLLOW_OP_UNION_in_expUnion345); 
            	    OP_UNION12_tree = (Object)adaptor.create(OP_UNION12);
            	    root_0 = (Object)adaptor.becomeRoot(OP_UNION12_tree, root_0);

            	    pushFollow(FOLLOW_expBase_in_expUnion348);
            	    expBase13=expBase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expBase13.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expUnion"

    public static class expBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expBase"
    // LogicTableAnalisis.g:41:1: expBase : ( VARIABLE_A | VARIABLE_B | VARIABLE_C | PARENT_AB expresion PARENT_CE );
    public final LogicTableAnalisisParser.expBase_return expBase() throws RecognitionException {
        LogicTableAnalisisParser.expBase_return retval = new LogicTableAnalisisParser.expBase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VARIABLE_A14=null;
        Token VARIABLE_B15=null;
        Token VARIABLE_C16=null;
        Token PARENT_AB17=null;
        Token PARENT_CE19=null;
        LogicTableAnalisisParser.expresion_return expresion18 = null;


        Object VARIABLE_A14_tree=null;
        Object VARIABLE_B15_tree=null;
        Object VARIABLE_C16_tree=null;
        Object PARENT_AB17_tree=null;
        Object PARENT_CE19_tree=null;

        try {
            // LogicTableAnalisis.g:42:9: ( VARIABLE_A | VARIABLE_B | VARIABLE_C | PARENT_AB expresion PARENT_CE )
            int alt5=4;
            switch ( input.LA(1) ) {
            case VARIABLE_A:
                {
                alt5=1;
                }
                break;
            case VARIABLE_B:
                {
                alt5=2;
                }
                break;
            case VARIABLE_C:
                {
                alt5=3;
                }
                break;
            case PARENT_AB:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // LogicTableAnalisis.g:42:11: VARIABLE_A
                    {
                    root_0 = (Object)adaptor.nil();

                    VARIABLE_A14=(Token)match(input,VARIABLE_A,FOLLOW_VARIABLE_A_in_expBase360); 
                    VARIABLE_A14_tree = (Object)adaptor.create(VARIABLE_A14);
                    adaptor.addChild(root_0, VARIABLE_A14_tree);


                    }
                    break;
                case 2 :
                    // LogicTableAnalisis.g:42:23: VARIABLE_B
                    {
                    root_0 = (Object)adaptor.nil();

                    VARIABLE_B15=(Token)match(input,VARIABLE_B,FOLLOW_VARIABLE_B_in_expBase363); 
                    VARIABLE_B15_tree = (Object)adaptor.create(VARIABLE_B15);
                    adaptor.addChild(root_0, VARIABLE_B15_tree);


                    }
                    break;
                case 3 :
                    // LogicTableAnalisis.g:43:1: VARIABLE_C
                    {
                    root_0 = (Object)adaptor.nil();

                    VARIABLE_C16=(Token)match(input,VARIABLE_C,FOLLOW_VARIABLE_C_in_expBase366); 
                    VARIABLE_C16_tree = (Object)adaptor.create(VARIABLE_C16);
                    adaptor.addChild(root_0, VARIABLE_C16_tree);


                    }
                    break;
                case 4 :
                    // LogicTableAnalisis.g:43:13: PARENT_AB expresion PARENT_CE
                    {
                    root_0 = (Object)adaptor.nil();

                    PARENT_AB17=(Token)match(input,PARENT_AB,FOLLOW_PARENT_AB_in_expBase369); 
                    pushFollow(FOLLOW_expresion_in_expBase372);
                    expresion18=expresion();

                    state._fsp--;

                    adaptor.addChild(root_0, expresion18.getTree());
                    PARENT_CE19=(Token)match(input,PARENT_CE,FOLLOW_PARENT_CE_in_expBase374); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expBase"

    public static class n_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "n"
    // LogicTableAnalisis.g:49:3: n : ( VARIABLE_A | ( OP_BICONDICIONAL izq= expresion der= expresion ) | ( OP_CONDICIONAL izq= expresion der= expresion ) | ( OP_INTERSECCION izq= expresion der= expresion ) | ( OP_UNION izq= expresion der= expresion ) );
    public final LogicTableAnalisisParser.n_return n() throws RecognitionException {
        LogicTableAnalisisParser.n_return retval = new LogicTableAnalisisParser.n_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VARIABLE_A20=null;
        Token OP_BICONDICIONAL21=null;
        Token OP_CONDICIONAL22=null;
        Token OP_INTERSECCION23=null;
        Token OP_UNION24=null;
        LogicTableAnalisisParser.expresion_return izq = null;

        LogicTableAnalisisParser.expresion_return der = null;


        Object VARIABLE_A20_tree=null;
        Object OP_BICONDICIONAL21_tree=null;
        Object OP_CONDICIONAL22_tree=null;
        Object OP_INTERSECCION23_tree=null;
        Object OP_UNION24_tree=null;

        try {
            // LogicTableAnalisis.g:49:4: ( VARIABLE_A | ( OP_BICONDICIONAL izq= expresion der= expresion ) | ( OP_CONDICIONAL izq= expresion der= expresion ) | ( OP_INTERSECCION izq= expresion der= expresion ) | ( OP_UNION izq= expresion der= expresion ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case VARIABLE_A:
                {
                alt6=1;
                }
                break;
            case OP_BICONDICIONAL:
                {
                alt6=2;
                }
                break;
            case OP_CONDICIONAL:
                {
                alt6=3;
                }
                break;
            case OP_INTERSECCION:
                {
                alt6=4;
                }
                break;
            case OP_UNION:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            Character n=VARIABLE_A;

            switch (alt6) {
                case 1 :
                    // LogicTableAnalisis.g:49:5: VARIABLE_A
                    {
                    root_0 = (Object)adaptor.nil();

                    VARIABLE_A20=(Token)match(input,VARIABLE_A,FOLLOW_VARIABLE_A_in_n393); 
                    VARIABLE_A20_tree = (Object)adaptor.create(VARIABLE_A20);
                    adaptor.addChild(root_0, VARIABLE_A20_tree);

                    Boolean result = new Boolean("true");

                    }
                    break;
                case 2 :
                    // LogicTableAnalisis.g:51:3: ( OP_BICONDICIONAL izq= expresion der= expresion )
                    {
                    root_0 = (Object)adaptor.nil();

                    // LogicTableAnalisis.g:51:3: ( OP_BICONDICIONAL izq= expresion der= expresion )
                    // LogicTableAnalisis.g:51:4: OP_BICONDICIONAL izq= expresion der= expresion
                    {
                    OP_BICONDICIONAL21=(Token)match(input,OP_BICONDICIONAL,FOLLOW_OP_BICONDICIONAL_in_n400); 
                    OP_BICONDICIONAL21_tree = (Object)adaptor.create(OP_BICONDICIONAL21);
                    adaptor.addChild(root_0, OP_BICONDICIONAL21_tree);

                    pushFollow(FOLLOW_expresion_in_n404);
                    izq=expresion();

                    state._fsp--;

                    adaptor.addChild(root_0, izq.getTree());
                    pushFollow(FOLLOW_expresion_in_n408);
                    der=expresion();

                    state._fsp--;

                    adaptor.addChild(root_0, der.getTree());

                    }

//                     if(izq==true&&der==true){
//                    	result = true;
//                    }else{
//                    if(izq==true&&der==false){
//                    	result = false;
//                    }else{
//                    if(izq==false&&der==true){
//                            result = false;
//                    }else{
//                        resul = true;
//                    }
//                    }
//                    }
                             

                    }
                    break;
                case 3 :
                    // LogicTableAnalisis.g:66:3: ( OP_CONDICIONAL izq= expresion der= expresion )
                    {
                    root_0 = (Object)adaptor.nil();

                    // LogicTableAnalisis.g:66:3: ( OP_CONDICIONAL izq= expresion der= expresion )
                    // LogicTableAnalisis.g:66:4: OP_CONDICIONAL izq= expresion der= expresion
                    {
                    OP_CONDICIONAL22=(Token)match(input,OP_CONDICIONAL,FOLLOW_OP_CONDICIONAL_in_n416); 
                    OP_CONDICIONAL22_tree = (Object)adaptor.create(OP_CONDICIONAL22);
                    adaptor.addChild(root_0, OP_CONDICIONAL22_tree);

                    pushFollow(FOLLOW_expresion_in_n420);
                    izq=expresion();

                    state._fsp--;

                    adaptor.addChild(root_0, izq.getTree());
                    pushFollow(FOLLOW_expresion_in_n424);
                    der=expresion();

                    state._fsp--;

                    adaptor.addChild(root_0, der.getTree());

                    }


//                        if(izq==true&&der==false){
//                            result = false;
//                        }else{
//                            result = true;
//                    }
                        

                    }
                    break;
                case 4 :
                    // LogicTableAnalisis.g:74:3: ( OP_INTERSECCION izq= expresion der= expresion )
                    {
                    root_0 = (Object)adaptor.nil();

                    // LogicTableAnalisis.g:74:3: ( OP_INTERSECCION izq= expresion der= expresion )
                    // LogicTableAnalisis.g:74:4: OP_INTERSECCION izq= expresion der= expresion
                    {
                    OP_INTERSECCION23=(Token)match(input,OP_INTERSECCION,FOLLOW_OP_INTERSECCION_in_n432); 
                    OP_INTERSECCION23_tree = (Object)adaptor.create(OP_INTERSECCION23);
                    adaptor.addChild(root_0, OP_INTERSECCION23_tree);

                    pushFollow(FOLLOW_expresion_in_n436);
                    izq=expresion();

                    state._fsp--;

                    adaptor.addChild(root_0, izq.getTree());
                    pushFollow(FOLLOW_expresion_in_n440);
                    der=expresion();

                    state._fsp--;

                    adaptor.addChild(root_0, der.getTree());

                    }


//                        if(izq==true&&der==true){
//                            result = true;
//                    }else{
//                            result = false;
//                    }
                         

                    }
                    break;
                case 5 :
                    // LogicTableAnalisis.g:82:3: ( OP_UNION izq= expresion der= expresion )
                    {
                    root_0 = (Object)adaptor.nil();

                    // LogicTableAnalisis.g:82:3: ( OP_UNION izq= expresion der= expresion )
                    // LogicTableAnalisis.g:82:4: OP_UNION izq= expresion der= expresion
                    {
                    OP_UNION24=(Token)match(input,OP_UNION,FOLLOW_OP_UNION_in_n448); 
                    OP_UNION24_tree = (Object)adaptor.create(OP_UNION24);
                    adaptor.addChild(root_0, OP_UNION24_tree);

                    pushFollow(FOLLOW_expresion_in_n452);
                    izq=expresion();

                    state._fsp--;

                    adaptor.addChild(root_0, izq.getTree());
                    pushFollow(FOLLOW_expresion_in_n456);
                    der=expresion();

                    state._fsp--;

                    adaptor.addChild(root_0, der.getTree());

                    }


//                    if(izq==false&&der==false){
//                        result false;
//                    }else{
//                        result true;
//                    }
                        

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "n"

    // Delegated rules


 

    public static final BitSet FOLLOW_expBiCond_in_expresion278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expCond_in_expBiCond288 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_OP_BICONDICIONAL_in_expBiCond291 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expCond_in_expBiCond294 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_expIntersec_in_expCond306 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_OP_CONDICIONAL_in_expCond309 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expIntersec_in_expCond312 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_expUnion_in_expIntersec324 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_OP_INTERSECCION_in_expIntersec327 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expUnion_in_expIntersec330 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_expBase_in_expUnion342 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_OP_UNION_in_expUnion345 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expBase_in_expUnion348 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_VARIABLE_A_in_expBase360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_B_in_expBase363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_C_in_expBase366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENT_AB_in_expBase369 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expresion_in_expBase372 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PARENT_CE_in_expBase374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_A_in_n393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_BICONDICIONAL_in_n400 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expresion_in_n404 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expresion_in_n408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CONDICIONAL_in_n416 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expresion_in_n420 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expresion_in_n424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_INTERSECCION_in_n432 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expresion_in_n436 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expresion_in_n440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_UNION_in_n448 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expresion_in_n452 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_expresion_in_n456 = new BitSet(new long[]{0x0000000000000002L});

}