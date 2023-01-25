package com.revenatium.facturations.web

import com.revenatium.facturations.domain.Invoice
import com.revenatium.facturations.repository.InvoiceRepository
import com.revenatium.facturations.service.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("invoice")
class InvoiceController {

    @Autowired
    lateinit var invoiceService: InvoiceService

    @PostMapping
    fun saveInvoice(@RequestBody invoice: Invoice): ResponseEntity<Invoice> {
        return ResponseEntity.ok(invoiceService.saveEntity(invoice))
    }
}