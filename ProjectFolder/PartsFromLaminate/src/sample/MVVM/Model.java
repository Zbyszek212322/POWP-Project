package sample.MVVM;

import sample.Builder.*;
import sample.Decorator.DecoratorAddFoil;
import sample.Decorator.DecoratorPrintNumber;
import sample.Decorator.DecoratorTrimEdges;
import sample.Decorator.PartDecorator;

public class Model {

    private boolean builderSmall;
    private boolean builderMedium;
    private boolean builderBig;
    private boolean decoratorEdges;
    private boolean decoratorNumber;
    private boolean decoratorFoil;

    PartDirector partDirector;

    public Model(boolean builderSmall, boolean builderMedium, boolean builderBig,
                 boolean decoratorEdges, boolean decoratorNumber, boolean decoratorFoil) {

        this.builderSmall = builderSmall;
        this.builderMedium = builderMedium;
        this.builderBig = builderBig;
        this.decoratorEdges = decoratorEdges;
        this.decoratorNumber = decoratorNumber;
        this.decoratorFoil = decoratorFoil;

        if (builderMedium) {

            MediumSizePartBuilder mediumSizePartBuilder = new MediumSizePartBuilder();
            partDirector = new PartDirector(mediumSizePartBuilder);

        } else if (builderBig) {

            BigSizePartBuilder bigSizePartBuilder = new BigSizePartBuilder();
            partDirector = new PartDirector(bigSizePartBuilder);

        } else {

            SmallSizePartBuilder smallSizePartBuilder = new SmallSizePartBuilder();
            partDirector = new PartDirector(smallSizePartBuilder);
        }

        partDirector.buildPart();
        Part part = partDirector.getPart();

        if (decoratorEdges && decoratorNumber && decoratorFoil) {
            new DecoratorAddFoil(new DecoratorPrintNumber(new DecoratorTrimEdges(new PartDecorator(part))));
        }
        if (decoratorEdges && decoratorNumber && !decoratorFoil) {
            new DecoratorPrintNumber(new DecoratorTrimEdges(new PartDecorator(part)));
        }
        if (decoratorEdges && !decoratorNumber && !decoratorFoil) {
            new DecoratorTrimEdges(new PartDecorator(part));

        }
        if (!decoratorEdges && !decoratorNumber && !decoratorFoil) {
            new PartDecorator(part);
        }
        if (!decoratorEdges && !decoratorNumber && decoratorFoil) {
            new DecoratorAddFoil(new PartDecorator(part));
        }
        if (!decoratorEdges && decoratorNumber && decoratorFoil) {
            new DecoratorAddFoil(new DecoratorPrintNumber(new PartDecorator(part)));
        }
        if (!decoratorEdges && decoratorNumber && !decoratorFoil) {
            new DecoratorPrintNumber(new PartDecorator(part));
        }
        if (decoratorEdges && !decoratorNumber && decoratorFoil) {
            new DecoratorAddFoil(new DecoratorTrimEdges(new PartDecorator(part)));
        }
    }
}
