import java.io.File;


fun readLines(filename: String) : List<String> {
    val bufferedReader = File(filename).bufferedReader();
    return bufferedReader.readLines();
}


fun maxCalories(lines : List<String>) : Int {
    assert(lines.isNotEmpty());

    var maxSoFar: Int = -1;
    var current : Int = 0;
    for (line in lines) {
        // done with an Elf
        if (line.isBlank()) {
            // println("some Elf with $current calories...");
            if (current > maxSoFar) {
                // println("and it is the max so far");
                maxSoFar = current;
            }
            current = 0;
        }
        else {
            current += line.toInt();
        }
    }

    assert(maxSoFar != -1);
    return maxSoFar;
}

fun main() {
    val lines = readLines("/Users/pablog/workspace/aoc-2022/aoc-2022/input/day1_1.txt");

    // part 1
    val result = maxCalories(lines);
    println("the Elf carrying the most Calories carries $result");

    // part 2

}