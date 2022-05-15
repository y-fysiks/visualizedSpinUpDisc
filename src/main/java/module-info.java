module com.visualizedspinupdisc.visualizedspinupdisc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.visualizedspinupdisc.visualizedspinupdisc to javafx.fxml;
    exports com.visualizedspinupdisc.visualizedspinupdisc;
}