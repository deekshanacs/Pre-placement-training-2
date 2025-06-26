patients = []
def admit_patient(name, age):
    patients.append({"Name": name, "Age": age})
admit_patient("Ravi", 30)
print(patients)
