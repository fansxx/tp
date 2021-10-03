package cooper.command;

import cooper.ui.Ui;
import cooper.finance.FinanceManager;

public class AddCommand extends Command {

    public boolean isInflow;
    public String amount;

    public AddCommand(String amount, boolean isInflow) {
        super();
        this.amount = amount;
        this.isInflow = isInflow;
    }

    public void execute() {
        FinanceManager.addBalance(Integer.parseInt(amount));
        Ui.printAddCommand(amount, isInflow);
    }

}


