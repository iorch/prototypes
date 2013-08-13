class DatosConsultaCurp
    def initialize(direccion_ip=nil,tipo_transaccion=nil,cve_usuario=nil,password=nil,cve_curp=nil,cve_entidad_emisora=nil,nombre=nil,primer_apellido=nil,segundo_apellido=nil,fecha_nacimiento=nil,sexo=nil,cve_alfa_ent_fed_nac=nil)
        @direccion_ip=direccion_ip
        @tipo_transaccion=tipo_transaccion
        @usuario=usuario
        @password=password
        @cve_curp=cve_curp
        @cve_entidad_emisora=cve_entidad_emisora
        @nombre=nombre
        @primer_apellido=primer_apellido
        @segundo_apellido=segundo_apellido
        @fecha_nacimiento=fecha_nacimiento
        @sexo=sexo
        @cve_alfa_ent_fed_nac=cve_alfa_ent_fed_nac
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
    def set_nombre nombre
        @nombre=nombre
    end
    def set_primer_apellido primer_apellido
        @primer_apellido=primer_apellido
    end
    def set_segundo_apellido segundo_apellido
        @segundo_apellido=segundo_apellido
    end
    def set_fecha_nacimiento fecha_nacimiento
        @fecha_nacimiento=fecha_nacimiento
    end
    def set_sexo sexo
        @sexo=sexo
    end
    def set_cve_alfa_ent_fed_nac cve_alfa_ent_fed_nac
        @cve_alfa_ent_fed_nac=cve_alfa_ent_fed_nac
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
    def get_nombre
        @nombre
    end
    def get_primer_apellido
        @primer_apellido
    end
    def get_segundo_apellido
        @segundo_apellido
    end
    def get_fecha_nacimiento        @fecha_nacimiento
    end
    def get_sexo
        @sexo
    end
    def get_cve_alfa_ent_fed_nac
        @cve_alfa_ent_fed_nac
    end
end

