/*
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watson.health.fhir.model.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;

import com.ibm.watson.health.fhir.model.annotation.Binding;
import com.ibm.watson.health.fhir.model.annotation.Choice;
import com.ibm.watson.health.fhir.model.annotation.Constraint;
import com.ibm.watson.health.fhir.model.annotation.Required;
import com.ibm.watson.health.fhir.model.type.BindingStrength;
import com.ibm.watson.health.fhir.model.type.Boolean;
import com.ibm.watson.health.fhir.model.type.Canonical;
import com.ibm.watson.health.fhir.model.type.Code;
import com.ibm.watson.health.fhir.model.type.CodeableConcept;
import com.ibm.watson.health.fhir.model.type.ContactDetail;
import com.ibm.watson.health.fhir.model.type.Date;
import com.ibm.watson.health.fhir.model.type.DateTime;
import com.ibm.watson.health.fhir.model.type.Element;
import com.ibm.watson.health.fhir.model.type.Extension;
import com.ibm.watson.health.fhir.model.type.Id;
import com.ibm.watson.health.fhir.model.type.Identifier;
import com.ibm.watson.health.fhir.model.type.Markdown;
import com.ibm.watson.health.fhir.model.type.Meta;
import com.ibm.watson.health.fhir.model.type.Narrative;
import com.ibm.watson.health.fhir.model.type.Period;
import com.ibm.watson.health.fhir.model.type.PublicationStatus;
import com.ibm.watson.health.fhir.model.type.Reference;
import com.ibm.watson.health.fhir.model.type.RelatedArtifact;
import com.ibm.watson.health.fhir.model.type.String;
import com.ibm.watson.health.fhir.model.type.Uri;
import com.ibm.watson.health.fhir.model.type.UsageContext;
import com.ibm.watson.health.fhir.model.util.ValidationSupport;
import com.ibm.watson.health.fhir.model.visitor.Visitor;

/**
 * The ResearchDefinition resource describes the conditional state (population and any exposures being compared within 
 * the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.
 */
@Constraint(
    id = "rsd-0",
    level = "Warning",
    location = "(base)",
    description = "Name should be usable as an identifier for the module by machine processing applications such as code generation",
    expression = "name.matches('[A-Z]([A-Za-z0-9_]){0,254}')"
)
@Generated("com.ibm.watson.health.fhir.tools.CodeGenerator")
public class ResearchDefinition extends DomainResource {
    private final Uri url;
    private final List<Identifier> identifier;
    private final String version;
    private final String name;
    private final String title;
    private final String shortTitle;
    private final String subtitle;
    @Required
    @Binding(
        bindingName = "PublicationStatus",
        strength = BindingStrength.ValueSet.REQUIRED,
        description = "The lifecycle status of an artifact.",
        valueSet = "http://hl7.org/fhir/ValueSet/publication-status|4.0.0"
    )
    private final PublicationStatus status;
    private final Boolean experimental;
    @Choice({ CodeableConcept.class, Reference.class })
    @Binding(
        bindingName = "SubjectType",
        strength = BindingStrength.ValueSet.EXTENSIBLE,
        description = "The possible types of subjects for the research (E.g. Patient, Practitioner, Organization, Location, etc.).",
        valueSet = "http://hl7.org/fhir/ValueSet/subject-type"
    )
    private final Element subject;
    private final DateTime date;
    private final String publisher;
    private final List<ContactDetail> contact;
    private final Markdown description;
    private final List<String> comment;
    private final List<UsageContext> useContext;
    @Binding(
        bindingName = "Jurisdiction",
        strength = BindingStrength.ValueSet.EXTENSIBLE,
        description = "Countries and regions within which this artifact is targeted for use.",
        valueSet = "http://hl7.org/fhir/ValueSet/jurisdiction"
    )
    private final List<CodeableConcept> jurisdiction;
    private final Markdown purpose;
    private final String usage;
    private final Markdown copyright;
    private final Date approvalDate;
    private final Date lastReviewDate;
    private final Period effectivePeriod;
    @Binding(
        bindingName = "DefinitionTopic",
        strength = BindingStrength.ValueSet.EXAMPLE,
        description = "High-level categorization of the definition, used for searching, sorting, and filtering.",
        valueSet = "http://hl7.org/fhir/ValueSet/definition-topic"
    )
    private final List<CodeableConcept> topic;
    private final List<ContactDetail> author;
    private final List<ContactDetail> editor;
    private final List<ContactDetail> reviewer;
    private final List<ContactDetail> endorser;
    private final List<RelatedArtifact> relatedArtifact;
    private final List<Canonical> library;
    @Required
    private final Reference population;
    private final Reference exposure;
    private final Reference exposureAlternative;
    private final Reference outcome;

    private volatile int hashCode;

    private ResearchDefinition(Builder builder) {
        super(builder);
        url = builder.url;
        identifier = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.identifier, "identifier"));
        version = builder.version;
        name = builder.name;
        title = builder.title;
        shortTitle = builder.shortTitle;
        subtitle = builder.subtitle;
        status = ValidationSupport.requireNonNull(builder.status, "status");
        experimental = builder.experimental;
        subject = ValidationSupport.choiceElement(builder.subject, "subject", CodeableConcept.class, Reference.class);
        date = builder.date;
        publisher = builder.publisher;
        contact = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.contact, "contact"));
        description = builder.description;
        comment = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.comment, "comment"));
        useContext = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.useContext, "useContext"));
        jurisdiction = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.jurisdiction, "jurisdiction"));
        purpose = builder.purpose;
        usage = builder.usage;
        copyright = builder.copyright;
        approvalDate = builder.approvalDate;
        lastReviewDate = builder.lastReviewDate;
        effectivePeriod = builder.effectivePeriod;
        topic = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.topic, "topic"));
        author = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.author, "author"));
        editor = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.editor, "editor"));
        reviewer = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.reviewer, "reviewer"));
        endorser = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.endorser, "endorser"));
        relatedArtifact = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.relatedArtifact, "relatedArtifact"));
        library = Collections.unmodifiableList(ValidationSupport.requireNonNull(builder.library, "library"));
        population = ValidationSupport.requireNonNull(builder.population, "population");
        exposure = builder.exposure;
        exposureAlternative = builder.exposureAlternative;
        outcome = builder.outcome;
        ValidationSupport.requireChildren(this);
    }

    /**
     * An absolute URI that is used to identify this research definition when it is referenced in a specification, model, 
     * design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal 
     * address at which at which an authoritative instance of this research definition is (or will be) published. This URL 
     * can be the target of a canonical reference. It SHALL remain the same when the research definition is stored on 
     * different servers.
     * 
     * @return
     *     An immutable object of type {@link Uri}.
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * A formal identifier that is used to identify this research definition when it is represented in other formats, or 
     * referenced in a specification, model, design or an instance.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link Identifier}.
     */
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * The identifier that is used to identify this version of the research definition when it is referenced in a 
     * specification, model, design or instance. This is an arbitrary value managed by the research definition author and is 
     * not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not 
     * available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a 
     * version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). 
     * For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a 
     * version is required for non-experimental active artifacts.
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getVersion() {
        return version;
    }

    /**
     * A natural language name identifying the research definition. This name should be usable as an identifier for the 
     * module by machine processing applications such as code generation.
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getName() {
        return name;
    }

    /**
     * A short, descriptive, user-friendly title for the research definition.
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getTitle() {
        return title;
    }

    /**
     * The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is 
     * not necessary.
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getShortTitle() {
        return shortTitle;
    }

    /**
     * An explanatory or alternate title for the ResearchDefinition giving additional information about its content.
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * The status of this research definition. Enables tracking the life-cycle of the content.
     * 
     * @return
     *     An immutable object of type {@link PublicationStatus}.
     */
    public PublicationStatus getStatus() {
        return status;
    }

    /**
     * A Boolean value to indicate that this research definition is authored for testing purposes (or 
     * education/evaluation/marketing) and is not intended to be used for genuine usage.
     * 
     * @return
     *     An immutable object of type {@link Boolean}.
     */
    public Boolean getExperimental() {
        return experimental;
    }

    /**
     * The intended subjects for the ResearchDefinition. If this element is not provided, a Patient subject is assumed, but 
     * the subject of the ResearchDefinition can be anything.
     * 
     * @return
     *     An immutable object of type {@link Element}.
     */
    public Element getSubject() {
        return subject;
    }

    /**
     * The date (and optionally time) when the research definition was published. The date must change when the business 
     * version changes and it must change if the status code changes. In addition, it should change when the substantive 
     * content of the research definition changes.
     * 
     * @return
     *     An immutable object of type {@link DateTime}.
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * The name of the organization or individual that published the research definition.
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link ContactDetail}.
     */
    public List<ContactDetail> getContact() {
        return contact;
    }

    /**
     * A free text natural language description of the research definition from a consumer's perspective.
     * 
     * @return
     *     An immutable object of type {@link Markdown}.
     */
    public Markdown getDescription() {
        return description;
    }

    /**
     * A human-readable string to clarify or explain concepts about the resource.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link String}.
     */
    public List<String> getComment() {
        return comment;
    }

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be 
     * general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and 
     * may be used to assist with indexing and searching for appropriate research definition instances.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link UsageContext}.
     */
    public List<UsageContext> getUseContext() {
        return useContext;
    }

    /**
     * A legal or geographic region in which the research definition is intended to be used.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link CodeableConcept}.
     */
    public List<CodeableConcept> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Explanation of why this research definition is needed and why it has been designed as it has.
     * 
     * @return
     *     An immutable object of type {@link Markdown}.
     */
    public Markdown getPurpose() {
        return purpose;
    }

    /**
     * A detailed description, from a clinical perspective, of how the ResearchDefinition is used.
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getUsage() {
        return usage;
    }

    /**
     * A copyright statement relating to the research definition and/or its contents. Copyright statements are generally 
     * legal restrictions on the use and publishing of the research definition.
     * 
     * @return
     *     An immutable object of type {@link Markdown}.
     */
    public Markdown getCopyright() {
        return copyright;
    }

    /**
     * The date on which the resource content was approved by the publisher. Approval happens once when the content is 
     * officially approved for usage.
     * 
     * @return
     *     An immutable object of type {@link Date}.
     */
    public Date getApprovalDate() {
        return approvalDate;
    }

    /**
     * The date on which the resource content was last reviewed. Review happens periodically after approval but does not 
     * change the original approval date.
     * 
     * @return
     *     An immutable object of type {@link Date}.
     */
    public Date getLastReviewDate() {
        return lastReviewDate;
    }

    /**
     * The period during which the research definition content was or is planned to be in active use.
     * 
     * @return
     *     An immutable object of type {@link Period}.
     */
    public Period getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Descriptive topics related to the content of the ResearchDefinition. Topics provide a high-level categorization 
     * grouping types of ResearchDefinitions that can be useful for filtering and searching.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link CodeableConcept}.
     */
    public List<CodeableConcept> getTopic() {
        return topic;
    }

    /**
     * An individiual or organization primarily involved in the creation and maintenance of the content.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link ContactDetail}.
     */
    public List<ContactDetail> getAuthor() {
        return author;
    }

    /**
     * An individual or organization primarily responsible for internal coherence of the content.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link ContactDetail}.
     */
    public List<ContactDetail> getEditor() {
        return editor;
    }

    /**
     * An individual or organization primarily responsible for review of some aspect of the content.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link ContactDetail}.
     */
    public List<ContactDetail> getReviewer() {
        return reviewer;
    }

    /**
     * An individual or organization responsible for officially endorsing the content for use in some setting.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link ContactDetail}.
     */
    public List<ContactDetail> getEndorser() {
        return endorser;
    }

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link RelatedArtifact}.
     */
    public List<RelatedArtifact> getRelatedArtifact() {
        return relatedArtifact;
    }

    /**
     * A reference to a Library resource containing the formal logic used by the ResearchDefinition.
     * 
     * @return
     *     An unmodifiable list containing immutable objects of type {@link Canonical}.
     */
    public List<Canonical> getLibrary() {
        return library;
    }

    /**
     * A reference to a ResearchElementDefinition resource that defines the population for the research.
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getPopulation() {
        return population;
    }

    /**
     * A reference to a ResearchElementDefinition resource that defines the exposure for the research.
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getExposure() {
        return exposure;
    }

    /**
     * A reference to a ResearchElementDefinition resource that defines the exposureAlternative for the research.
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getExposureAlternative() {
        return exposureAlternative;
    }

    /**
     * A reference to a ResearchElementDefinition resomece that defines the outcome for the research.
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getOutcome() {
        return outcome;
    }

    @Override
    public boolean hasChildren() {
        return super.hasChildren() || 
            (url != null) || 
            !identifier.isEmpty() || 
            (version != null) || 
            (name != null) || 
            (title != null) || 
            (shortTitle != null) || 
            (subtitle != null) || 
            (status != null) || 
            (experimental != null) || 
            (subject != null) || 
            (date != null) || 
            (publisher != null) || 
            !contact.isEmpty() || 
            (description != null) || 
            !comment.isEmpty() || 
            !useContext.isEmpty() || 
            !jurisdiction.isEmpty() || 
            (purpose != null) || 
            (usage != null) || 
            (copyright != null) || 
            (approvalDate != null) || 
            (lastReviewDate != null) || 
            (effectivePeriod != null) || 
            !topic.isEmpty() || 
            !author.isEmpty() || 
            !editor.isEmpty() || 
            !reviewer.isEmpty() || 
            !endorser.isEmpty() || 
            !relatedArtifact.isEmpty() || 
            !library.isEmpty() || 
            (population != null) || 
            (exposure != null) || 
            (exposureAlternative != null) || 
            (outcome != null);
    }

    @Override
    public void accept(java.lang.String elementName, int elementIndex, Visitor visitor) {
        if (visitor.preVisit(this)) {
            visitor.visitStart(elementName, elementIndex, this);
            if (visitor.visit(elementName, elementIndex, this)) {
                // visit children
                accept(id, "id", visitor);
                accept(meta, "meta", visitor);
                accept(implicitRules, "implicitRules", visitor);
                accept(language, "language", visitor);
                accept(text, "text", visitor);
                accept(contained, "contained", visitor, Resource.class);
                accept(extension, "extension", visitor, Extension.class);
                accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                accept(url, "url", visitor);
                accept(identifier, "identifier", visitor, Identifier.class);
                accept(version, "version", visitor);
                accept(name, "name", visitor);
                accept(title, "title", visitor);
                accept(shortTitle, "shortTitle", visitor);
                accept(subtitle, "subtitle", visitor);
                accept(status, "status", visitor);
                accept(experimental, "experimental", visitor);
                accept(subject, "subject", visitor);
                accept(date, "date", visitor);
                accept(publisher, "publisher", visitor);
                accept(contact, "contact", visitor, ContactDetail.class);
                accept(description, "description", visitor);
                accept(comment, "comment", visitor, String.class);
                accept(useContext, "useContext", visitor, UsageContext.class);
                accept(jurisdiction, "jurisdiction", visitor, CodeableConcept.class);
                accept(purpose, "purpose", visitor);
                accept(usage, "usage", visitor);
                accept(copyright, "copyright", visitor);
                accept(approvalDate, "approvalDate", visitor);
                accept(lastReviewDate, "lastReviewDate", visitor);
                accept(effectivePeriod, "effectivePeriod", visitor);
                accept(topic, "topic", visitor, CodeableConcept.class);
                accept(author, "author", visitor, ContactDetail.class);
                accept(editor, "editor", visitor, ContactDetail.class);
                accept(reviewer, "reviewer", visitor, ContactDetail.class);
                accept(endorser, "endorser", visitor, ContactDetail.class);
                accept(relatedArtifact, "relatedArtifact", visitor, RelatedArtifact.class);
                accept(library, "library", visitor, Canonical.class);
                accept(population, "population", visitor);
                accept(exposure, "exposure", visitor);
                accept(exposureAlternative, "exposureAlternative", visitor);
                accept(outcome, "outcome", visitor);
            }
            visitor.visitEnd(elementName, elementIndex, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ResearchDefinition other = (ResearchDefinition) obj;
        return Objects.equals(id, other.id) && 
            Objects.equals(meta, other.meta) && 
            Objects.equals(implicitRules, other.implicitRules) && 
            Objects.equals(language, other.language) && 
            Objects.equals(text, other.text) && 
            Objects.equals(contained, other.contained) && 
            Objects.equals(extension, other.extension) && 
            Objects.equals(modifierExtension, other.modifierExtension) && 
            Objects.equals(url, other.url) && 
            Objects.equals(identifier, other.identifier) && 
            Objects.equals(version, other.version) && 
            Objects.equals(name, other.name) && 
            Objects.equals(title, other.title) && 
            Objects.equals(shortTitle, other.shortTitle) && 
            Objects.equals(subtitle, other.subtitle) && 
            Objects.equals(status, other.status) && 
            Objects.equals(experimental, other.experimental) && 
            Objects.equals(subject, other.subject) && 
            Objects.equals(date, other.date) && 
            Objects.equals(publisher, other.publisher) && 
            Objects.equals(contact, other.contact) && 
            Objects.equals(description, other.description) && 
            Objects.equals(comment, other.comment) && 
            Objects.equals(useContext, other.useContext) && 
            Objects.equals(jurisdiction, other.jurisdiction) && 
            Objects.equals(purpose, other.purpose) && 
            Objects.equals(usage, other.usage) && 
            Objects.equals(copyright, other.copyright) && 
            Objects.equals(approvalDate, other.approvalDate) && 
            Objects.equals(lastReviewDate, other.lastReviewDate) && 
            Objects.equals(effectivePeriod, other.effectivePeriod) && 
            Objects.equals(topic, other.topic) && 
            Objects.equals(author, other.author) && 
            Objects.equals(editor, other.editor) && 
            Objects.equals(reviewer, other.reviewer) && 
            Objects.equals(endorser, other.endorser) && 
            Objects.equals(relatedArtifact, other.relatedArtifact) && 
            Objects.equals(library, other.library) && 
            Objects.equals(population, other.population) && 
            Objects.equals(exposure, other.exposure) && 
            Objects.equals(exposureAlternative, other.exposureAlternative) && 
            Objects.equals(outcome, other.outcome);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Objects.hash(id, 
                meta, 
                implicitRules, 
                language, 
                text, 
                contained, 
                extension, 
                modifierExtension, 
                url, 
                identifier, 
                version, 
                name, 
                title, 
                shortTitle, 
                subtitle, 
                status, 
                experimental, 
                subject, 
                date, 
                publisher, 
                contact, 
                description, 
                comment, 
                useContext, 
                jurisdiction, 
                purpose, 
                usage, 
                copyright, 
                approvalDate, 
                lastReviewDate, 
                effectivePeriod, 
                topic, 
                author, 
                editor, 
                reviewer, 
                endorser, 
                relatedArtifact, 
                library, 
                population, 
                exposure, 
                exposureAlternative, 
                outcome);
            hashCode = result;
        }
        return result;
    }

    @Override
    public Builder toBuilder() {
        return new Builder().from(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends DomainResource.Builder {
        private Uri url;
        private List<Identifier> identifier = new ArrayList<>();
        private String version;
        private String name;
        private String title;
        private String shortTitle;
        private String subtitle;
        private PublicationStatus status;
        private Boolean experimental;
        private Element subject;
        private DateTime date;
        private String publisher;
        private List<ContactDetail> contact = new ArrayList<>();
        private Markdown description;
        private List<String> comment = new ArrayList<>();
        private List<UsageContext> useContext = new ArrayList<>();
        private List<CodeableConcept> jurisdiction = new ArrayList<>();
        private Markdown purpose;
        private String usage;
        private Markdown copyright;
        private Date approvalDate;
        private Date lastReviewDate;
        private Period effectivePeriod;
        private List<CodeableConcept> topic = new ArrayList<>();
        private List<ContactDetail> author = new ArrayList<>();
        private List<ContactDetail> editor = new ArrayList<>();
        private List<ContactDetail> reviewer = new ArrayList<>();
        private List<ContactDetail> endorser = new ArrayList<>();
        private List<RelatedArtifact> relatedArtifact = new ArrayList<>();
        private List<Canonical> library = new ArrayList<>();
        private Reference population;
        private Reference exposure;
        private Reference exposureAlternative;
        private Reference outcome;

        private Builder() {
            super();
        }

        /**
         * The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
         * 
         * @param id
         *     Logical id of this artifact
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder id(Id id) {
            return (Builder) super.id(id);
        }

        /**
         * The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content 
         * might not always be associated with version changes to the resource.
         * 
         * @param meta
         *     Metadata about the resource
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder meta(Meta meta) {
            return (Builder) super.meta(meta);
        }

        /**
         * A reference to a set of rules that were followed when the resource was constructed, and which must be understood when 
         * processing the content. Often, this is a reference to an implementation guide that defines the special rules along 
         * with other profiles etc.
         * 
         * @param implicitRules
         *     A set of rules under which this content was created
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder implicitRules(Uri implicitRules) {
            return (Builder) super.implicitRules(implicitRules);
        }

        /**
         * The base language in which the resource is written.
         * 
         * @param language
         *     Language of the resource content
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder language(Code language) {
            return (Builder) super.language(language);
        }

        /**
         * A human-readable narrative that contains a summary of the resource and can be used to represent the content of the 
         * resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient 
         * detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what 
         * content should be represented in the narrative to ensure clinical safety.
         * 
         * @param text
         *     Text summary of the resource, for human interpretation
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder text(Narrative text) {
            return (Builder) super.text(text);
        }

        /**
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder contained(Resource... contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder contained(Collection<Resource> contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * 
         * <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder modifierExtension(Extension... modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * 
         * <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance
         */
        @Override
        public Builder modifierExtension(Collection<Extension> modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * An absolute URI that is used to identify this research definition when it is referenced in a specification, model, 
         * design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal 
         * address at which at which an authoritative instance of this research definition is (or will be) published. This URL 
         * can be the target of a canonical reference. It SHALL remain the same when the research definition is stored on 
         * different servers.
         * 
         * @param url
         *     Canonical identifier for this research definition, represented as a URI (globally unique)
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder url(Uri url) {
            this.url = url;
            return this;
        }

        /**
         * A formal identifier that is used to identify this research definition when it is represented in other formats, or 
         * referenced in a specification, model, design or an instance.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param identifier
         *     Additional identifier for the research definition
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder identifier(Identifier... identifier) {
            for (Identifier value : identifier) {
                this.identifier.add(value);
            }
            return this;
        }

        /**
         * A formal identifier that is used to identify this research definition when it is represented in other formats, or 
         * referenced in a specification, model, design or an instance.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param identifier
         *     Additional identifier for the research definition
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder identifier(Collection<Identifier> identifier) {
            this.identifier = new ArrayList<>(identifier);
            return this;
        }

        /**
         * The identifier that is used to identify this version of the research definition when it is referenced in a 
         * specification, model, design or instance. This is an arbitrary value managed by the research definition author and is 
         * not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not 
         * available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a 
         * version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). 
         * For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a 
         * version is required for non-experimental active artifacts.
         * 
         * @param version
         *     Business version of the research definition
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * A natural language name identifying the research definition. This name should be usable as an identifier for the 
         * module by machine processing applications such as code generation.
         * 
         * @param name
         *     Name for this research definition (computer friendly)
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * A short, descriptive, user-friendly title for the research definition.
         * 
         * @param title
         *     Name for this research definition (human friendly)
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is 
         * not necessary.
         * 
         * @param shortTitle
         *     Title for use in informal contexts
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder shortTitle(String shortTitle) {
            this.shortTitle = shortTitle;
            return this;
        }

        /**
         * An explanatory or alternate title for the ResearchDefinition giving additional information about its content.
         * 
         * @param subtitle
         *     Subordinate title of the ResearchDefinition
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        /**
         * The status of this research definition. Enables tracking the life-cycle of the content.
         * 
         * <p>This element is required.
         * 
         * @param status
         *     draft | active | retired | unknown
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder status(PublicationStatus status) {
            this.status = status;
            return this;
        }

        /**
         * A Boolean value to indicate that this research definition is authored for testing purposes (or 
         * education/evaluation/marketing) and is not intended to be used for genuine usage.
         * 
         * @param experimental
         *     For testing purposes, not real usage
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder experimental(Boolean experimental) {
            this.experimental = experimental;
            return this;
        }

        /**
         * The intended subjects for the ResearchDefinition. If this element is not provided, a Patient subject is assumed, but 
         * the subject of the ResearchDefinition can be anything.
         * 
         * <p>This is a choice element with the following allowed types:
         * <ul>
         * <li>{@link CodeableConcept}</li>
         * <li>{@link Reference}</li>
         * </ul>
         * 
         * @param subject
         *     E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder subject(Element subject) {
            this.subject = subject;
            return this;
        }

        /**
         * The date (and optionally time) when the research definition was published. The date must change when the business 
         * version changes and it must change if the status code changes. In addition, it should change when the substantive 
         * content of the research definition changes.
         * 
         * @param date
         *     Date last changed
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder date(DateTime date) {
            this.date = date;
            return this;
        }

        /**
         * The name of the organization or individual that published the research definition.
         * 
         * @param publisher
         *     Name of the publisher (organization or individual)
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        /**
         * Contact details to assist a user in finding and communicating with the publisher.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param contact
         *     Contact details for the publisher
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder contact(ContactDetail... contact) {
            for (ContactDetail value : contact) {
                this.contact.add(value);
            }
            return this;
        }

        /**
         * Contact details to assist a user in finding and communicating with the publisher.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param contact
         *     Contact details for the publisher
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder contact(Collection<ContactDetail> contact) {
            this.contact = new ArrayList<>(contact);
            return this;
        }

        /**
         * A free text natural language description of the research definition from a consumer's perspective.
         * 
         * @param description
         *     Natural language description of the research definition
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder description(Markdown description) {
            this.description = description;
            return this;
        }

        /**
         * A human-readable string to clarify or explain concepts about the resource.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param comment
         *     Used for footnotes or explanatory notes
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder comment(String... comment) {
            for (String value : comment) {
                this.comment.add(value);
            }
            return this;
        }

        /**
         * A human-readable string to clarify or explain concepts about the resource.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param comment
         *     Used for footnotes or explanatory notes
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder comment(Collection<String> comment) {
            this.comment = new ArrayList<>(comment);
            return this;
        }

        /**
         * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be 
         * general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and 
         * may be used to assist with indexing and searching for appropriate research definition instances.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param useContext
         *     The context that the content is intended to support
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder useContext(UsageContext... useContext) {
            for (UsageContext value : useContext) {
                this.useContext.add(value);
            }
            return this;
        }

        /**
         * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be 
         * general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and 
         * may be used to assist with indexing and searching for appropriate research definition instances.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param useContext
         *     The context that the content is intended to support
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder useContext(Collection<UsageContext> useContext) {
            this.useContext = new ArrayList<>(useContext);
            return this;
        }

        /**
         * A legal or geographic region in which the research definition is intended to be used.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param jurisdiction
         *     Intended jurisdiction for research definition (if applicable)
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder jurisdiction(CodeableConcept... jurisdiction) {
            for (CodeableConcept value : jurisdiction) {
                this.jurisdiction.add(value);
            }
            return this;
        }

        /**
         * A legal or geographic region in which the research definition is intended to be used.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param jurisdiction
         *     Intended jurisdiction for research definition (if applicable)
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder jurisdiction(Collection<CodeableConcept> jurisdiction) {
            this.jurisdiction = new ArrayList<>(jurisdiction);
            return this;
        }

        /**
         * Explanation of why this research definition is needed and why it has been designed as it has.
         * 
         * @param purpose
         *     Why this research definition is defined
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder purpose(Markdown purpose) {
            this.purpose = purpose;
            return this;
        }

        /**
         * A detailed description, from a clinical perspective, of how the ResearchDefinition is used.
         * 
         * @param usage
         *     Describes the clinical usage of the ResearchDefinition
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        /**
         * A copyright statement relating to the research definition and/or its contents. Copyright statements are generally 
         * legal restrictions on the use and publishing of the research definition.
         * 
         * @param copyright
         *     Use and/or publishing restrictions
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder copyright(Markdown copyright) {
            this.copyright = copyright;
            return this;
        }

        /**
         * The date on which the resource content was approved by the publisher. Approval happens once when the content is 
         * officially approved for usage.
         * 
         * @param approvalDate
         *     When the research definition was approved by publisher
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder approvalDate(Date approvalDate) {
            this.approvalDate = approvalDate;
            return this;
        }

        /**
         * The date on which the resource content was last reviewed. Review happens periodically after approval but does not 
         * change the original approval date.
         * 
         * @param lastReviewDate
         *     When the research definition was last reviewed
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder lastReviewDate(Date lastReviewDate) {
            this.lastReviewDate = lastReviewDate;
            return this;
        }

        /**
         * The period during which the research definition content was or is planned to be in active use.
         * 
         * @param effectivePeriod
         *     When the research definition is expected to be used
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder effectivePeriod(Period effectivePeriod) {
            this.effectivePeriod = effectivePeriod;
            return this;
        }

        /**
         * Descriptive topics related to the content of the ResearchDefinition. Topics provide a high-level categorization 
         * grouping types of ResearchDefinitions that can be useful for filtering and searching.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param topic
         *     The category of the ResearchDefinition, such as Education, Treatment, Assessment, etc.
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder topic(CodeableConcept... topic) {
            for (CodeableConcept value : topic) {
                this.topic.add(value);
            }
            return this;
        }

        /**
         * Descriptive topics related to the content of the ResearchDefinition. Topics provide a high-level categorization 
         * grouping types of ResearchDefinitions that can be useful for filtering and searching.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param topic
         *     The category of the ResearchDefinition, such as Education, Treatment, Assessment, etc.
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder topic(Collection<CodeableConcept> topic) {
            this.topic = new ArrayList<>(topic);
            return this;
        }

        /**
         * An individiual or organization primarily involved in the creation and maintenance of the content.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param author
         *     Who authored the content
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder author(ContactDetail... author) {
            for (ContactDetail value : author) {
                this.author.add(value);
            }
            return this;
        }

        /**
         * An individiual or organization primarily involved in the creation and maintenance of the content.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param author
         *     Who authored the content
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder author(Collection<ContactDetail> author) {
            this.author = new ArrayList<>(author);
            return this;
        }

        /**
         * An individual or organization primarily responsible for internal coherence of the content.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param editor
         *     Who edited the content
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder editor(ContactDetail... editor) {
            for (ContactDetail value : editor) {
                this.editor.add(value);
            }
            return this;
        }

        /**
         * An individual or organization primarily responsible for internal coherence of the content.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param editor
         *     Who edited the content
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder editor(Collection<ContactDetail> editor) {
            this.editor = new ArrayList<>(editor);
            return this;
        }

        /**
         * An individual or organization primarily responsible for review of some aspect of the content.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param reviewer
         *     Who reviewed the content
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder reviewer(ContactDetail... reviewer) {
            for (ContactDetail value : reviewer) {
                this.reviewer.add(value);
            }
            return this;
        }

        /**
         * An individual or organization primarily responsible for review of some aspect of the content.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param reviewer
         *     Who reviewed the content
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder reviewer(Collection<ContactDetail> reviewer) {
            this.reviewer = new ArrayList<>(reviewer);
            return this;
        }

        /**
         * An individual or organization responsible for officially endorsing the content for use in some setting.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param endorser
         *     Who endorsed the content
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder endorser(ContactDetail... endorser) {
            for (ContactDetail value : endorser) {
                this.endorser.add(value);
            }
            return this;
        }

        /**
         * An individual or organization responsible for officially endorsing the content for use in some setting.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param endorser
         *     Who endorsed the content
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder endorser(Collection<ContactDetail> endorser) {
            this.endorser = new ArrayList<>(endorser);
            return this;
        }

        /**
         * Related artifacts such as additional documentation, justification, or bibliographic references.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param relatedArtifact
         *     Additional documentation, citations, etc.
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder relatedArtifact(RelatedArtifact... relatedArtifact) {
            for (RelatedArtifact value : relatedArtifact) {
                this.relatedArtifact.add(value);
            }
            return this;
        }

        /**
         * Related artifacts such as additional documentation, justification, or bibliographic references.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param relatedArtifact
         *     Additional documentation, citations, etc.
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder relatedArtifact(Collection<RelatedArtifact> relatedArtifact) {
            this.relatedArtifact = new ArrayList<>(relatedArtifact);
            return this;
        }

        /**
         * A reference to a Library resource containing the formal logic used by the ResearchDefinition.
         * 
         * <p>Adds new element(s) to the existing list
         * 
         * @param library
         *     Logic used by the ResearchDefinition
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder library(Canonical... library) {
            for (Canonical value : library) {
                this.library.add(value);
            }
            return this;
        }

        /**
         * A reference to a Library resource containing the formal logic used by the ResearchDefinition.
         * 
         * <p>Replaces the existing list with a new one containing elements from the Collection
         * 
         * @param library
         *     Logic used by the ResearchDefinition
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder library(Collection<Canonical> library) {
            this.library = new ArrayList<>(library);
            return this;
        }

        /**
         * A reference to a ResearchElementDefinition resource that defines the population for the research.
         * 
         * <p>This element is required.
         * 
         * @param population
         *     What population?
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder population(Reference population) {
            this.population = population;
            return this;
        }

        /**
         * A reference to a ResearchElementDefinition resource that defines the exposure for the research.
         * 
         * @param exposure
         *     What exposure?
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder exposure(Reference exposure) {
            this.exposure = exposure;
            return this;
        }

        /**
         * A reference to a ResearchElementDefinition resource that defines the exposureAlternative for the research.
         * 
         * @param exposureAlternative
         *     What alternative exposure state?
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder exposureAlternative(Reference exposureAlternative) {
            this.exposureAlternative = exposureAlternative;
            return this;
        }

        /**
         * A reference to a ResearchElementDefinition resomece that defines the outcome for the research.
         * 
         * @param outcome
         *     What outcome?
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder outcome(Reference outcome) {
            this.outcome = outcome;
            return this;
        }

        /**
         * Build the {@link ResearchDefinition}
         * 
         * <p>Required elements:
         * <ul>
         * <li>status</li>
         * <li>population</li>
         * </ul>
         * 
         * @return
         *     An immutable object of type {@link ResearchDefinition}
         */
        @Override
        public ResearchDefinition build() {
            return new ResearchDefinition(this);
        }

        protected Builder from(ResearchDefinition researchDefinition) {
            super.from(researchDefinition);
            url = researchDefinition.url;
            identifier.addAll(researchDefinition.identifier);
            version = researchDefinition.version;
            name = researchDefinition.name;
            title = researchDefinition.title;
            shortTitle = researchDefinition.shortTitle;
            subtitle = researchDefinition.subtitle;
            status = researchDefinition.status;
            experimental = researchDefinition.experimental;
            subject = researchDefinition.subject;
            date = researchDefinition.date;
            publisher = researchDefinition.publisher;
            contact.addAll(researchDefinition.contact);
            description = researchDefinition.description;
            comment.addAll(researchDefinition.comment);
            useContext.addAll(researchDefinition.useContext);
            jurisdiction.addAll(researchDefinition.jurisdiction);
            purpose = researchDefinition.purpose;
            usage = researchDefinition.usage;
            copyright = researchDefinition.copyright;
            approvalDate = researchDefinition.approvalDate;
            lastReviewDate = researchDefinition.lastReviewDate;
            effectivePeriod = researchDefinition.effectivePeriod;
            topic.addAll(researchDefinition.topic);
            author.addAll(researchDefinition.author);
            editor.addAll(researchDefinition.editor);
            reviewer.addAll(researchDefinition.reviewer);
            endorser.addAll(researchDefinition.endorser);
            relatedArtifact.addAll(researchDefinition.relatedArtifact);
            library.addAll(researchDefinition.library);
            population = researchDefinition.population;
            exposure = researchDefinition.exposure;
            exposureAlternative = researchDefinition.exposureAlternative;
            outcome = researchDefinition.outcome;
            return this;
        }
    }
}
