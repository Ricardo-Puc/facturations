package com.revenatium.facturations.domain

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

@Entity
@AllArgsConstructor
@NoArgsConstructor
class Invoice {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var name:String? = null
    var rfc:String? = null
    var taxRegime:String? = null
    var cfdi:String? = null
    var address:String? = null
}