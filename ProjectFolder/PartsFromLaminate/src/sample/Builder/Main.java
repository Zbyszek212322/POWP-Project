package sample.Builder;

public class Main {

    public static void main(String[] args) {

        // mała część

        SmallSizePartBuilder smallSizePartBuilder = new SmallSizePartBuilder();
        PartDirector smallSizePartDirector = new PartDirector(smallSizePartBuilder);
        smallSizePartDirector.buildPart();
        Part smallPart = smallSizePartDirector.getPart();
        System.out.println(smallPart);

        // średnia część

        MediumSizePartBuilder mediumSizePartBuilder = new MediumSizePartBuilder();
        PartDirector mediumSizePartDirector = new PartDirector(mediumSizePartBuilder);
        mediumSizePartDirector.buildPart();
        Part mediumPart = mediumSizePartDirector.getPart();
        System.out.println(mediumPart);

        // duża część

        BigSizePartBuilder bigSizePartBuilder = new BigSizePartBuilder();
        PartDirector bigSizePartDirector = new PartDirector(bigSizePartBuilder);
        bigSizePartDirector.buildPart();
        Part bigPart = bigSizePartDirector.getPart();
        System.out.println(bigPart);

    }
}
