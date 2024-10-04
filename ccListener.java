// Generated from cc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ccParser}.
 */
public interface ccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ccParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ccParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#hw}.
	 * @param ctx the parse tree
	 */
	void enterHw(ccParser.HwContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#hw}.
	 * @param ctx the parse tree
	 */
	void exitHw(ccParser.HwContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#hardware}.
	 * @param ctx the parse tree
	 */
	void enterHardware(ccParser.HardwareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#hardware}.
	 * @param ctx the parse tree
	 */
	void exitHardware(ccParser.HardwareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(ccParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(ccParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(ccParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(ccParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(ccParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(ccParser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(ccParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(ccParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#updates}.
	 * @param ctx the parse tree
	 */
	void enterUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#updates}.
	 * @param ctx the parse tree
	 */
	void exitUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#siminputs}.
	 * @param ctx the parse tree
	 */
	void enterSiminputs(ccParser.SiminputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#siminputs}.
	 * @param ctx the parse tree
	 */
	void exitSiminputs(ccParser.SiminputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#signal}.
	 * @param ctx the parse tree
	 */
	void enterSignal(ccParser.SignalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#signal}.
	 * @param ctx the parse tree
	 */
	void exitSignal(ccParser.SignalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#funk}.
	 * @param ctx the parse tree
	 */
	void enterFunk(ccParser.FunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#funk}.
	 * @param ctx the parse tree
	 */
	void exitFunk(ccParser.FunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(ccParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(ccParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNOT(ccParser.NOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNOT(ccParser.NOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOR(ccParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOR(ccParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ccParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ccParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAND(ccParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAND(ccParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParen(ccParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParen(ccParser.ParenContext ctx);
}