package com.revenatium.facturations.service

import com.revenatium.facturations.domain.Invoice
import com.revenatium.facturations.repository.InvoiceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InvoiceService {

    @Autowired
    lateinit var invoiceRepository: InvoiceRepository

    fun saveEntity(request:Invoice): Invoice{
    return invoiceRepository.save(request)
    }
}