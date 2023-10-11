import java.util.Random
enum class State{
    Over, InProgress
}

fun main(args: Array<String>) {
    var sum = rollDice();
    var gameState: State = State.InProgress;
    var point: Int = 0 ;

    when (sum){
        7, 11 ->{
            println("You win!");
            return;
        }
        2, 3, 12 -> {
            println("You lose!")
            return;
        }
        else -> {
            point = sum;
        }
    }

    while(gameState.equals(State.InProgress)){
        sum = rollDice();
        println("You rolled " + sum + ".")

        if(sum == point){
            gameState = State.Over;
            println("You win!")
        }
        else if (sum == 7 ){
            gameState = State.Over;
            println("You lose!")
        }
    }
}

fun rollDice() : Int{

    val firstDie: Int = (1..6).random();
    val secondDie: Int = (1..6).random();

    val sum = firstDie + secondDie;

    println("Plauer rolled " + sum);
    return sum
}