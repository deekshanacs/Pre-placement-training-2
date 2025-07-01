class Patient:
    def __init__(self, patient_id, name, age, symptoms):
        self.patient_id = patient_id
        self.name = name
        self.age = age
        self.symptoms = symptoms
        self.diagnosis = "Pending"

class Hospital:
    def __init__(self):
        self.patients = []

    def register_patient(self, name, age, symptoms):
        patient_id = len(self.patients) + 1
        patient = Patient(patient_id, name, age, symptoms)
        self.patients.append(patient)
        return patient

    def check_diagnosis(self, symptoms):
        symptom_map = {
            "fever": "Viral Infection",
            "cough": "Common Cold",
            "headache": "Migraine",
            "chest pain": "Cardiac issue",
            "fatigue": "Anemia"
        }
        for s in symptoms:
            if s.lower() in symptom_map:
                return symptom_map[s.lower()]
        return "Further tests required"

    def diagnose_patient(self, patient):
        diagnosis = self.check_diagnosis(patient.symptoms)
        patient.diagnosis = diagnosis
        print(f"Diagnosis for {patient.name}: {diagnosis}")
hospital = Hospital()
p1 = hospital.register_patient("Alice", 30, ["fever", "cough"])
p2 = hospital.register_patient("Bob", 45, ["chest pain"])

hospital.diagnose_patient(p1)
hospital.diagnose_patient(p2)
