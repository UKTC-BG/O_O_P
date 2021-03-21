
///////////////////// INTERFACES /////////////////////////////

package ABSTRACTION_AND_INTERFACE;


interface DZI_Pattern_Interface { // Implemented by ABSTRACTION_AND_INTERFACE.test_interface

    // Method body IS ALLOWED !!! That's why we SHOULD OVERRIDE

    public default void main_method(){          // Overridden in ABSTRACTION_AND_INTERFACE.test_interface
    };

    public default void input_method(){         // Overridden in ABSTRACTION_AND_INTERFACE.test_interface
    };

    public default void processing_method(){    // Overridden in ABSTRACTION_AND_INTERFACE.test_interface
    };

    public default void output_method(){        // Overridden in ABSTRACTION_AND_INTERFACE.test_interface
        System.out.println
                ("Hello Interface !");
    };

}
