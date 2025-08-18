function handleApiResponse(response) {
    document.getElementById('api-response').textContent = JSON.stringify(response, null, 2);
}

// PATIENT FORM
const patientForm = document.getElementById('patient-form');
if (patientForm) {
    patientForm.onsubmit = async function(e){
        e.preventDefault();
        const fd = new FormData(e.target);
        const body = Object.fromEntries(fd.entries());
        const res = await fetch('http://localhost:6061/api/patients', {
            method: 'POST', headers: {'Content-Type':'application/json'},
            body: JSON.stringify(body)
        });
        handleApiResponse(await res.json());
    };
}

// DOCTOR FORM
const doctorForm = document.getElementById('doctor-form');
if (doctorForm) {
    doctorForm.onsubmit = async function(e){
        e.preventDefault();
        const fd = new FormData(e.target);
        const body = Object.fromEntries(fd.entries());
        const res = await fetch('http://localhost:6062/api/doctors', {
            method: 'POST', headers: {'Content-Type':'application/json'},
            body: JSON.stringify(body)
        });
        handleApiResponse(await res.json());
    };
}

// BLOCK SLOT FORM
const blockSlotForm = document.getElementById('block-slot-form');
if (blockSlotForm) {
    blockSlotForm.onsubmit = async function(e){
        e.preventDefault();
        const fd = new FormData(e.target);
        const doctorId = fd.get('doctorId');
        const body = { apptTime: fd.get('apptTime') };
        const res = await fetch(`http://localhost:6062/api/doctors/${doctorId}/block-slot`, {
            method: 'PUT', headers: {'Content-Type':'application/json'},
            body: JSON.stringify(body)
        });
        handleApiResponse(await res.json());
    };
}

// APPOINTMENT FORM
const appointmentForm = document.getElementById('appointment-form');
if (appointmentForm) {
    appointmentForm.onsubmit = async function(e){
        e.preventDefault();
        const fd = new FormData(e.target);
        const body = Object.fromEntries(fd.entries());
        body.patientId = parseInt(body.patientId);
        body.doctorId = parseInt(body.doctorId);
        const res = await fetch('http://localhost:6063/api/appointments', {
            method: 'POST', headers: {'Content-Type':'application/json'},
            body: JSON.stringify(body)
        });
        handleApiResponse(await res.json());
    };
}

// MEDICAL RECORD FORM
const medicalRecordForm = document.getElementById('medicalrecord-form');
if (medicalRecordForm) {
    medicalRecordForm.onsubmit = async function(e){
        e.preventDefault();
        const fd = new FormData(e.target);
        const body = Object.fromEntries(fd.entries());
        body.patientId = parseInt(body.patientId);
        body.doctorId = parseInt(body.doctorId);
        const res = await fetch('http://localhost:6064/api/medical-records', {
            method: 'POST', headers: {'Content-Type':'application/json'},
            body: JSON.stringify(body)
        });
        handleApiResponse(await res.json());
    };
}

// BILLING: GENERATE BILL
const billForm = document.getElementById('bill-form');
if (billForm) {
    billForm.onsubmit = async function(e){
        e.preventDefault();
        const fd = new FormData(e.target);
        const body = Object.fromEntries(fd.entries());
        body.appointmentId = parseInt(body.appointmentId);
        body.amount = parseFloat(body.amount);
        const res = await fetch('http://localhost:6065/api/bills', {
            method: 'POST', headers: {'Content-Type':'application/json'},
            body: JSON.stringify(body)
        });
        handleApiResponse(await res.json());
    };
}

// BILLING: MARK AS PAID
const payForm = document.getElementById('pay-form');
if (payForm) {
    payForm.onsubmit = async function(e){
        e.preventDefault();
        const fd = new FormData(e.target);
        const billId = fd.get('billId');
        const body = { paymentMethod: fd.get('paymentMethod') };
        const res = await fetch(`http://localhost:6065/api/bills/${billId}/pay`, {
            method: 'PUT', headers: {'Content-Type':'application/json'},
            body: JSON.stringify(body)
        });
        handleApiResponse(await res.json());
    };
}

// BILLING: UPDATE CLAIM
const claimForm = document.getElementById('claim-form');
if (claimForm) {
    claimForm.onsubmit = async function(e){
        e.preventDefault();
        const fd = new FormData(e.target);
        const billId = fd.get('billId');
        const body = { insuranceClaimNumber: fd.get('insuranceClaimNumber') };
        const res = await fetch(`http://localhost:6065/api/bills/${billId}/claim`, {
            method: 'PUT', headers: {'Content-Type':'application/json'},
            body: JSON.stringify(body)
        });
        handleApiResponse(await res.json());
    };
}
