module org.example {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    exports org.example to javafx.graphics, javafx.fxml;

    exports org.example.PhysicsService to javafx.fxml;

    opens org.example.PhysicsService to javafx.fxml;
}