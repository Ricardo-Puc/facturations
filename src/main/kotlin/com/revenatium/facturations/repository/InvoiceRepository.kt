package com.revenatium.facturations.repository

import com.revenatium.facturations.domain.Invoice
import org.springframework.data.jpa.repository.JpaRepository

interface InvoiceRepository : JpaRepository<Invoice, Long> {
}