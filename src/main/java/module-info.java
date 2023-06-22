module com.javaraush.island.ponedelnikov.island {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens com.javarush.island.ponedelnikov.island to javafx.fxml;
    exports com.javarush.island.ponedelnikov.island;
}