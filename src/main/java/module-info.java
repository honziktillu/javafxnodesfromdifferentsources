module com.spsmb.javafxnodesfromdifferentsources {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spsmb.javafxnodesfromdifferentsources to javafx.fxml;
    exports com.spsmb.javafxnodesfromdifferentsources;
}