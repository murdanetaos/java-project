# Candle Shop Receipt Generator

This Java program generates a receipt for a candle shop, calculating the total burn time, total dollar per burn time, and total price for a selection of candles.

## Getting Started

To run the program, ensure you have Java installed on your system. Then, follow these steps:

1. Clone or download the repository.
2. Open a terminal or command prompt and navigate to the directory containing the Java file (`Main.java`).
3. Compile the Java file using the command: `javac Main.java`.
4. Run the compiled program using the command: `java Main`.

## Usage

The program is set up to generate a receipt for a sample selection of candles. You can modify the candle details or add additional candles by editing the `main` method in the `Main.java` file.

To modify the candle details:
1. Locate the `main` method in the `Main.java` file.
2. Modify the existing `Candle` objects (`candle1`, `candle2`, `candle3`) or create new `Candle` objects with the desired details.
3. Recompile and run the program to generate the updated receipt.

## Output

The program generates a receipt displaying the details of each candle, including the candle name, quantity, burn time, dollar per burn time, and price. It also calculates the total burn time, total dollar per burn time, and total price for all the candles.

The receipt is printed to the console in a formatted manner.

## Dependencies

The program uses the `java.text.DecimalFormat` class from the Java standard library for formatting the dollar per burn time to two decimal places.

## Contributing

Contributions to this project are welcome. Feel free to submit bug reports, feature requests, or pull requests through the repository's issue tracker and pull request system.

