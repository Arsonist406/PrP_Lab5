package Commands;

public class ExitCommand extends Command {
    public ExitCommand() {
        super();
    }

    @Override
    public void execute() {
        this.logger.exit();
        System.exit(0);
    }
}
