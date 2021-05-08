// Generated from Dwunasta.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DwunastaParser}.
 */
public interface DwunastaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DwunastaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DwunastaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DwunastaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DwunastaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DwunastaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DwunastaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DwunastaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DwunastaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLoop(DwunastaParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLoop(DwunastaParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(DwunastaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(DwunastaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DwunastaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DwunastaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_arr_val}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint_arr_val(DwunastaParser.Print_arr_valContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_arr_val}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint_arr_val(DwunastaParser.Print_arr_valContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign_string}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_string(DwunastaParser.Assign_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_string}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_string(DwunastaParser.Assign_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DwunastaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DwunastaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRead(DwunastaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRead(DwunastaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(DwunastaParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link DwunastaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(DwunastaParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DwunastaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DwunastaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DwunastaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DwunastaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DwunastaParser#blockif}.
	 * @param ctx the parse tree
	 */
	void enterBlockif(DwunastaParser.BlockifContext ctx);
	/**
	 * Exit a parse tree produced by {@link DwunastaParser#blockif}.
	 * @param ctx the parse tree
	 */
	void exitBlockif(DwunastaParser.BlockifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link DwunastaParser#math_stmnt}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(DwunastaParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link DwunastaParser#math_stmnt}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(DwunastaParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link DwunastaParser#math_stmnt}.
	 * @param ctx the parse tree
	 */
	void enterAdd(DwunastaParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link DwunastaParser#math_stmnt}.
	 * @param ctx the parse tree
	 */
	void exitAdd(DwunastaParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DwunastaParser#math_stmnt}.
	 * @param ctx the parse tree
	 */
	void enterSub(DwunastaParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DwunastaParser#math_stmnt}.
	 * @param ctx the parse tree
	 */
	void exitSub(DwunastaParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link DwunastaParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(DwunastaParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link DwunastaParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(DwunastaParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link DwunastaParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void enterRepetitions(DwunastaParser.RepetitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DwunastaParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void exitRepetitions(DwunastaParser.RepetitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterInt(DwunastaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitInt(DwunastaParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterReal(DwunastaParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitReal(DwunastaParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(DwunastaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(DwunastaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArray(DwunastaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArray(DwunastaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castint}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterCastint(DwunastaParser.CastintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castint}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitCastint(DwunastaParser.CastintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castreal}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterCastreal(DwunastaParser.CastrealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castreal}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitCastreal(DwunastaParser.CastrealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterPar(DwunastaParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitPar(DwunastaParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id_assign}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterId_assign(DwunastaParser.Id_assignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_assign}
	 * labeled alternative in {@link DwunastaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitId_assign(DwunastaParser.Id_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DwunastaParser#fparam}.
	 * @param ctx the parse tree
	 */
	void enterFparam(DwunastaParser.FparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DwunastaParser#fparam}.
	 * @param ctx the parse tree
	 */
	void exitFparam(DwunastaParser.FparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DwunastaParser#fblock}.
	 * @param ctx the parse tree
	 */
	void enterFblock(DwunastaParser.FblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DwunastaParser#fblock}.
	 * @param ctx the parse tree
	 */
	void exitFblock(DwunastaParser.FblockContext ctx);
}