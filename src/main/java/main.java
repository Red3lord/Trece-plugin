/ The Command
use pocketmine\command\Command;
      
// Person who does command
use pocketmine\command\CommandSender;
public function onCommand(CommandSender $sender, Command $command, string $label, array $args) : bool {
    switch($command->getName()) {
        case "example":
            $sender->sendMessage("Hello " . $sender->getName() . "!");

            return true;
        default:
            throw new \AssertionError("This line will never be executed");
    }
           }