class DatosConsultaCurp
    def initialize(direccion_ip=nil,tipo_transaccion=nil,usuario=nil,password=nil,cve_curp=nil,cve_entidad_emisora=nil)
        @direccion_ip=direccion_ip
        @tipo_transaccion=tipo_transaccion
        @usuario=usuario
        @password=password
        @cve_curp=cve_curp
        @cve_entidad_emisora=cve_entidad_emisora
    end
    #Setters
    def set_direccion_ip direccion_ip
        @direccion_ip=direccion_ip
    end
    def set_tipo_transaccion tipo_transaccion
        @tipo_transaccion=tipo_transaccion
    end
    def set_usuario usuario
        @usuario=usuario
    end
    def set_password password
        @password=password
    end
    def set_cve_curp cve_curp
        @cve_curp=cve_curp
    end
    def set_cve_entidad_emisora cve_entidad_emisora
        @cve_entidad_emisora=cve_entidad_emisora
    end
    #Getters
    def get_direccion_ip 
        @direccion_ip
    end
    def get_tipo_transaccion
        @tipo_transaccion
    end
    def get_usuario
        @usuario
    end
    def get_password
        @password
    end
    def get_cve_curp
        @cve_curp
    end
    def get_cve_entidad_emisora
        @cve_entidad_emisora
    end
end
